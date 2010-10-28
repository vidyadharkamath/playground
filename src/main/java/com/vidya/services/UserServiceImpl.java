package com.vidya.services;

import java.util.List;

import com.vidya.dao.UserDAO;
import com.vidya.model.User;

public class UserServiceImpl implements UserService
{
    private UserDAO userDAO;

    public UserDAO getUserDAO()
    {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO)
    {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getAllUsers()
    {
        return userDAO.getAllUsers();
    }

    @Override
    public void saveOrUpdate(User user)
    {
        userDAO.saveUser(user);
    }
}
