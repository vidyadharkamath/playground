package com.vidya.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vidya.model.User;
import com.vidya.services.UserService;

@Controller
@RequestMapping("/register.do")
public class UserRegisterController
{
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public String processForm(@ModelAttribute("user") User user,
            BindingResult result, Map<String, Object> model)
    {
        userService.saveOrUpdate(user);

        return "redirect:trade/list.do";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String showForm(Map<String, Object> model)
    {
        User user = new User();
        model.put("user", user);
        return "register";
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