package com.vidya.test;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vidya.dao.UserDAO;
import com.vidya.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/app-config.xml" })
public class UserTest
{
    private UserDAO dao;

    @Autowired
    public void setDao(UserDAO dao)
    {
        this.dao = dao;
    }

    @Test
    public void testCreateData()
    {
        int expectedResult = 1;
        User user = new User();

        user.setUserName("Adit");
        dao.saveUser(user);
        Assert.assertEquals(expectedResult, dao.getAllUsers());
    }

    @Test
    public void testRetrieveData()
    {
        List<User> userList = dao.getAllUsers();
        Assert.assertEquals(1, userList.size());
        User userExpected = userList.get(0);
        User userResult = dao.getUserByUserId(userExpected.getUserId());
        Assert.assertEquals(userExpected.getUserId(), userResult.getUserId());
    }

    @Test
    public void testUpdateData()
    {
        List<User> userList = dao.getAllUsers();
        Assert.assertEquals(1, userList.size());
        User userExpected = userList.get(0);
        userExpected.setUserName("Singgih");
        dao.saveUser(userExpected);
        User userResult = dao.getUserByUserId(userExpected.getUserId());
        Assert.assertEquals(userExpected.getUserName(), userResult
                .getUserName());
    }

    @Test
    public void testDeleteData()
    {
        List<User> userList = dao.getAllUsers();
        Assert.assertEquals(1, userList.size());
        User userExpected = userList.get(0);
        dao.deleteUser(userExpected);
        User userResult = dao.getUserByUserId(userExpected.getUserId());
        Assert.assertEquals(userResult, null);
    }
}
