package com.vidya.handlers;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.vidya.model.User;

public class UserRegistrationHandler implements Controller
{

    public ModelAndView handleRequest(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException
    {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("User");

        // First unit of work
        EntityManager em = emf.createEntityManager();

        User user = new User();
        user.setName("Vidyadhar");
        user.setPassword("MyPass");
        em.persist(user);
        em.close();
        emf.close();
        return new ModelAndView("helloWorld.jsp");
    }
}
