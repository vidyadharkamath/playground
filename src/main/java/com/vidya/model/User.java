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
        @NamedQuery(name = "User.findByUserName", query = " SELECT u FROM users u where u.userName = ?"),
        @NamedQuery(name = "User.findById", query = " SELECT u FROM users u where u.userId = ?") })
public class User implements java.io.Serializable
{
    private static final long serialVersionUID = 1L;

    private String userId;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String zipCode;

    @Column(name = "PASSWORD")
    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    @Column(name = "USERNAME", nullable = false)
    public String getUserName()
    {
        return userName;
    }

    @Column(name = "FIRSTNAME", nullable = false)
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

    @Column(name = "LASTNAME")
    public String getLastName()
    {
        return lastName;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    @Column(name = "EMAIL")
    public String getEmail()
    {
        return email;
    }

    public void setZipCode(String zipCode)
    {
        this.zipCode = zipCode;
    }

    @Column(name = "ZIPCODE")
    public String getZipCode()
    {
        return zipCode;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "USERID", unique = true, nullable = false)
    public String getUserId()
    {
        return userId;
    }
}
