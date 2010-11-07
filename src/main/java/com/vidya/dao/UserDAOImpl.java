package com.vidya.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vidya.model.User;

@Repository("userDao")
@Transactional
public class UserDAOImpl extends BaseDAO implements UserDAO
{

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

    @SuppressWarnings("unchecked")
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

    @SuppressWarnings("unchecked")
    @Override
    public List<User> getUserByUserName(String userName)
    {
        return (List<User>) hibernateTemplate.findByNamedQuery(
                "User.findByUserName", userName);
    }
}
