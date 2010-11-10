package com.vidya.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vidya.model.User;

@Controller
public class LoginController extends BaseController
{

    @RequestMapping(value = "/login.do", method = RequestMethod.GET)
    public String login(Map<String, Object> model)
    {
        User user = new User();
        model.put("user", user);
        return "login";
    }

    @RequestMapping(value = "/logout.do", method = RequestMethod.GET)
    public String logout(Map<String, Object> model)
    {
        User user = new User();
        model.put("user", user);
        return "logout";
    }

}