package com.vidya.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.vidya.model.User;
import com.vidya.services.UserService;

public class UserRegisterController extends AbstractController
{
    private UserService userService;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request,
            HttpServletResponse response) throws Exception
    {
        User user = new User();
        user.setName("vidyadhar");
        user.setPassword("vidyadhar");
        userService.saveOrUpdate(user);

        return new ModelAndView("registrationStatus");
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