package com.vidya.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;

@Entity(name = "users")
@NamedQueries( {
        @NamedQuery(name = "User.findAll", query = " SELECT u FROM users u"),
        @NamedQuery(name = "User.findByUserName", query = " SELECT u FROM users u where u.userName = ?"),
        @NamedQuery(name = "User.findById", query = " SELECT u FROM users u where u.id = ?") })
public class User implements java.io.Serializable, UserDetails
{
    private static final long serialVersionUID = 1L;
    private String id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String zipCode;

    @Transient
    private Collection<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();

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

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return email;
    }

    public void setZipCode(String zipCode)
    {
        this.zipCode = zipCode;
    }

    public String getZipCode()
    {
        return zipCode;
    }

    @Override
    @Transient
    public Collection<GrantedAuthority> getAuthorities()
    {
        roles.add(new GrantedAuthorityImpl("ROLE_USER"));
        return roles;
    }

    @Override
    @Transient
    public String getUsername()
    {
        // TODO Auto-generated method stub
        return this.userName;
    }

    @Override
    @Transient
    public boolean isAccountNonExpired()
    {
        return true;
    }

    @Override
    @Transient
    public boolean isAccountNonLocked()
    {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    @Transient
    public boolean isCredentialsNonExpired()
    {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    @Transient
    public boolean isEnabled()
    {
        // TODO Auto-generated method stub
        return true;
    }
}
