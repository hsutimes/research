package org.hsu.research.service.impl;

import org.hsu.research.dao.UserDao;
import org.hsu.research.entity.User;
import org.hsu.research.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author times
 * @file UserServiceImpl.java
 * @time 2019/2/20
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserList() {
        return userDao.queryUser();
    }

    @Override
    public User getUserById(int id) {
        User user = userDao.queryUserById(id);
        if (user == null) {
            throw new RuntimeException("用户不存在");
        }
        return user;
    }

    @Override
    public User getUserByName(String name) {
        return userDao.queryUserByName(name);
    }

    @Override
    public boolean login(String name, String pw, int power) {
        if (userDao.checkUserName(name) == 0) {
            throw new RuntimeException("用户名不存在");
        } else {
            String pwt = userDao.queryUserPw(name, power);
            if (pwt == null) {
                throw new RuntimeException("身份信息错误");
            } else if (!pw.equals(pwt)) {
                throw new RuntimeException("密码错误");
            } else {
                return true;
            }
        }
    }

    @Override
    public boolean addUser(User user) {
        return userDao.insertUser(user) != 0;
    }

    @Override
    public boolean modifyUser(User user) {
        return userDao.updateUser(user) != 0;
    }

    @Override
    public boolean deleteUser(int id) {
        return userDao.deleteUser(id) != 0;
    }
}
