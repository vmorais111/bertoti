import React, { useState, useEffect } from "react";
import axios from "axios";
import UserList from "./components/UserList";
import UserForm from "./components/UserForm";
import { User } from "./types/User";

const App: React.FC = () => {
  const [users, setUsers] = useState<User[]>([]);
  const [selectedUser, setSelectedUser] = useState<User | null>(null);

  useEffect(() => {
    fetchUsers();
  }, []);

  const fetchUsers = async () => {
    try {
      const response = await axios.get("http://localhost:8080/users");
      setUsers(response.data);
    } catch (error) {
      console.error("Error fetching users:", error);
    }
  };

  const handleEditUser = (user: User) => {
    setSelectedUser(user);
  };

  const handleDeleteUser = async (id: number) => {
    try {
      await axios.delete(`http://localhost:8080/users/${id}`);
      fetchUsers(); // Refresh list
    } catch (error) {
      console.error("Error deleting user:", error);
    }
  };

  const handleSave = (updated: boolean) => {
    if (updated) {
      fetchUsers(); // Refresh list after save
    }
    setSelectedUser(null);
  };

  return (
    <div className="min-h-screen bg-gray-50">
      <header className="bg-blue-600 text-white text-center py-4">
        <h1 className="text-3xl font-bold">Spring Boot React CRUD</h1>
      </header>
      <main className="p-8">
        <UserForm selectedUser={selectedUser} onSave={handleSave} />
        <UserList users={users} onEditUser={handleEditUser} onDeleteUser={handleDeleteUser} />
      </main>
    </div>
  );
};

export default App;
