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
        @NamedQuery(name = "User.findByUserName", query = " SELECT u FROM users u where u.userName = :userName"),
        @NamedQuery(name = "User.findById", query = " SELECT u FROM users u where u.id = :id") })
public class User implements java.io.Serializable
{
    private static final long serialVersionUID = 1L;
    private String id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String zipCode;

    public String getPassword()
    {
        return password;
    }

    @Column(name = "password")
    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id")
    public String getId()
    {
        return id;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    @Column(name = "userName", nullable = false)
    public String getUserName()
    {
        return userName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setZipCode(String zipCode)
    {
        this.zipCode = zipCode;
    }

    public String getZipCode()
    {
        return zipCode;
    }
}
