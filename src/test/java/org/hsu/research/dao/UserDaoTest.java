package org.hsu.research.dao;

import org.hsu.research.entity.User;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void queryUser() {
        List<User> userList = userDao.queryUser();
        assertEquals(7, userList.size());
    }

    @Test
    @Ignore
    public void queryUserById() {

    }

    @Test
    @Ignore
    public void insertUser() {

    }

    @Test
    @Ignore
    public void updateUser() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/forum?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=GMT"
                    , "root", "123456");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        assertEquals(2, 2);
    }

    @Test
    @Ignore
    public void deleteUser() {

    }
}