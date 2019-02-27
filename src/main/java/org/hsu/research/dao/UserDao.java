package org.hsu.research.dao;

import org.hsu.research.entity.User;

import java.util.List;

public interface UserDao {
    List<User> queryUser();

    User queryUserById(int id);

    User queryUserByName(String name);

    int checkUserName(String name);

    String queryUserPw(String name, int power);

    int insertUser(User user);

    int updateUser(User user);

    int deleteUser(int id);
}
