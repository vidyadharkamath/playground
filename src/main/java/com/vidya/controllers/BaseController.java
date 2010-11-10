package com.vidya.controllers;

import org.springframework.security.core.context.SecurityContextHolder;

import com.vidya.model.User;
import com.vidya.services.UserService;

public class BaseController
{
    protected UserService userService;

    public void setUserService(UserService userService)
    {
        this.userService = userService;
    }

    public UserService getUserService()
    {
        return userService;
    }

    public User getLoggedInUser()
    {
        Object principal = SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();

        if (principal instanceof User)
        {
            User user = (User) principal;
            return user;
        }
        return null;
    }

}
