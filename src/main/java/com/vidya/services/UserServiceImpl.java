package com.vidya.services;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.vidya.dao.UserDAO;
import com.vidya.model.User;

public class UserServiceImpl implements UserService, UserDetailsService
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

    @Override
    public List<User> findByUserName(String userName)
    {
        return userDAO.getUserByUserName(userName);
    }

    @Override
    public UserDetails loadUserByUsername(String userName)
            throws UsernameNotFoundException, DataAccessException
    {
        List<User> user = userDAO.getUserByUserName(userName);

        if (user == null || user.size() == 0)
        {

            throw new UsernameNotFoundException("User not found");
        }

        return (UserDetails) user.get(0);

    }
}
