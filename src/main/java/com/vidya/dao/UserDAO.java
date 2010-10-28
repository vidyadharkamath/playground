package com.vidya.dao;

import java.util.List;

import com.vidya.model.User;

public interface UserDAO
{
    public void saveUser(User user);

    public User getUserByUserId(String userId);

    public User getUserByUserName(String userName);

    public void deleteUser(User user);

    public List<User> getAllUsers();
}
