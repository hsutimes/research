package org.hsu.research.service;

import org.hsu.research.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();

    User getUserById(int id);

    User getUserByName(String name);

    boolean login(String name, String pw, int power);

    boolean addUser(User user);

    boolean modifyUser(User user);

    boolean deleteUser(int id);
}
