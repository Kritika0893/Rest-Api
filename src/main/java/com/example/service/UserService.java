package com.example.service;


import com.example.model.User;


import java.util.ArrayList;
import java.util.List;

public class UserService {
        private List<User> users;

        public UserService() {
            this.users = new ArrayList<>();
        }

        public User registerUser(String username, String firstname) {
            User newUser = new User(username, firstname);
            users.add(newUser);
            return newUser;
        }

        public User findAllUser(String username) {
            for (User user : users) {
                if (user.getUsername().equals(username)) {
                    return user;
                }
            }
            return null; // User not found
        }

        public User findById(int id) {
            for (User user : users) {

                return user;
            }// User not found
            return null;
        }

        public boolean updateUser(String username, String firstname) {
            User userToUpdate = getUserByUsername(username);
            if (userToUpdate != null) {
                userToUpdate.setFirstName(firstname);
                return true; // User email updated successfully
            }
            return false; // User not found
        }

        private User getUserByUsername(String username) {
            return null;
        }

        public boolean deleteUser(String username) {
            User userToDelete = getUserByUsername(username);
            if (userToDelete != null) {
                users.remove(userToDelete);
                return true; // User deleted successfully
            }
            return false; // User not found
        }

    public User insert(User user) {
        return user;
    }

    public void delete(int id) {
    }

    public User updateUser(int id) {
        return null;
    }

    public List<User> findAll() {
        return null;
    }
}


