package com.vidya.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "users")
@NamedQueries( {
        @NamedQuery(name = "User.findAll", query = " SELECT u FROM users u"),
        @NamedQuery(name = "User.findByName", query = " SELECT u FROM users u where u.name = :name"),
        @NamedQuery(name = "User.findById", query = " SELECT u FROM users u where u.id = :id") })
public class User implements java.io.Serializable
{
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id")
    private String id;

    @Column(name = "userName", nullable = false)
    private String name;

    @Column(name = "password")
    private String password;

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
