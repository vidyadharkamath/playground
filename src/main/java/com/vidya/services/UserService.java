package com.vidya.services;

import java.util.List;

import com.vidya.model.User;

public interface UserService
{
    public List<User> getAllUsers();

    public void saveOrUpdate(User user);

}
