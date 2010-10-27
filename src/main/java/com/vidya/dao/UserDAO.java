package com.vidya.dao;

import java.util.List;

import com.vidya.model.User;

public interface UserDAO
{
    public void saveUser(User user);

    public List<User> getAllUser(User user);

    public User selectUserById(String userId);

    public void deleteUser(User user);
}
