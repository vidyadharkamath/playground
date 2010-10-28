package com.vidya.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.vidya.model.User;
import com.vidya.services.UserService;

public class UserListController extends AbstractController
{
    private UserService userService;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request,
            HttpServletResponse response) throws Exception
    {
        List<User> users = userService.getAllUsers();
        return new ModelAndView("userList", "users", users);
    }

    public UserService getUserService()
    {
        return userService;
    }

    public void setUserService(UserService userService)
    {
        this.userService = userService;
    }
}
