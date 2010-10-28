package com.vidya.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vidya.model.User;

@Repository("userDao")
@Transactional
public class UserDAOImpl implements UserDAO
{
    private HibernateTemplate hibernateTemplate;

    public void setSessionFactory(SessionFactory sessionFactory)
    {
        hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

    @Transactional(readOnly = false)
    public void saveUser(User user)
    {
        hibernateTemplate.saveOrUpdate(user);
    }

    @Transactional(readOnly = false)
    public void deleteUser(User user)
    {
        hibernateTemplate.delete(user);
    }

    @Override
    public List<User> getAllUsers()
    {
        return (List<User>) hibernateTemplate.findByNamedQuery("User.findAll");
    }

    @Override
    public User getUserByUserId(String userId)
    {
        return (User) hibernateTemplate.findByNamedQuery("User.findById",
                userId);
    }

    @Override
    public User getUserByUserName(String userName)
    {
        return (User) hibernateTemplate.findByNamedQuery("User.findByUserName",
                userName);
    }
}
