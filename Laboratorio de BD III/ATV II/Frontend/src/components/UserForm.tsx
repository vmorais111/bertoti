import React, { useState, useEffect } from "react";
import axios from "axios";
import { User } from "../types/User";

interface UserFormProps {
  selectedUser: User | null;
  onSave: (updated: boolean) => void;
}

const UserForm: React.FC<UserFormProps> = ({ selectedUser, onSave }) => {
  const [user, setUser] = useState<User>({ username: "", email: "", password: "" });

  useEffect(() => {
    if (selectedUser) {
      setUser(selectedUser);
    } else {
      setUser({ username: "", email: "", password: "" });
    }
  }, [selectedUser]);

  const handleChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    const { name, value } = e.target;
    setUser({ ...user, [name]: value });
  };

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault();
    try {
      if (user.id) {
        await axios.put(`http://localhost:8080/users/${user.id}`, user);
      } else {
        await axios.post("http://localhost:8080/users", user);
      }
      onSave(true); // Notify parent of successful save
    } catch (error) {
      console.error("Error saving user:", error);
      onSave(false); // Notify parent of failure
    }
  };

  return (
    <div className="p-4">
      <h2 className="text-2xl font-bold mb-4">
        {user.id ? "Edit User" : "Create User"}
      </h2>
      <form onSubmit={handleSubmit} className="space-y-4">
        <input
          type="text"
          name="username"
          placeholder="Username"
          value={user.username}
          onChange={handleChange}
          required
          className="w-full px-4 py-2 border rounded"
        />
        <input
          type="email"
          name="email"
          placeholder="Email"
          value={user.email}
          onChange={handleChange}
          required
          className="w-full px-4 py-2 border rounded"
        />
        <input
          type="password"
          name="password"
          placeholder="Password"
          value={user.password}
          onChange={handleChange}
          required
          className="w-full px-4 py-2 border rounded"
        />
        <button
          type="submit"
          className="px-4 py-2 bg-green-500 text-white rounded"
        >
          {user.id ? "Update" : "Create"}
        </button>
      </form>
    </div>
  );
};

export default UserForm;
