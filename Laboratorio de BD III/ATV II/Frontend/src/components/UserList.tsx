import React from "react";
import { User } from "../types/User";

interface UserListProps {
  users: User[];
  onEditUser: (user: User) => void;
  onDeleteUser: (id: number) => void;
}

const UserList: React.FC<UserListProps> = ({ users, onEditUser, onDeleteUser }) => {
  return (
    <div className="p-4">
      <h2 className="text-2xl font-bold mb-4">User List</h2>
      <ul className="space-y-2">
        {users.map((user) => (
          <li
            key={user.id}
            className="flex justify-between items-center p-4 bg-gray-100 rounded"
          >
            <span>
              {user.username} ({user.email})
            </span>
            <div className="space-x-2">
              <button
                onClick={() => onEditUser(user)}
                className="px-4 py-2 bg-blue-500 text-white rounded"
              >
                Edit
              </button>
              <button
                onClick={() => user.id && onDeleteUser(user.id)}
                className="px-4 py-2 bg-red-500 text-white rounded"
              >
                Delete
              </button>
            </div>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default UserList;
