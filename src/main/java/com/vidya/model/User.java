package com.vidya.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;

@NamedQueries( {
        @NamedQuery(name = "User.findAll", query = " SELECT u FROM User u"),
        @NamedQuery(name = "User.findByUserName", query = " SELECT u FROM User u where u.username = ?"),
        @NamedQuery(name = "User.findById", query = " SELECT u FROM User u where u.userId = ?") })
@Entity
@Table(name = "users")
public class User implements Serializable, UserDetails
{
    public static List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>(
            0);

    private static final long serialVersionUID = 1L;

    private String userId;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String zipCode;
    private Set<Trade> trades = new HashSet<Trade>(0);

    @Column(name = "PASSWORD")
    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    @Column(name = "FIRSTNAME", nullable = false)
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
    @Column(name = "USER_ID", unique = true, nullable = false)
    public String getUserId()
    {
        return userId;
    }

    public void setTrades(Set<Trade> trades)
    {
        this.trades = trades;
    }

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "USER_TRADES", joinColumns = { @JoinColumn(name = "USER_ID") }, inverseJoinColumns = { @JoinColumn(name = "TRADE_ID") })
    @Cascade(org.hibernate.annotations.CascadeType.DELETE_ORPHAN)
    public Set<Trade> getTrades()
    {
        return trades;
    }

    public void setUsername(String userName)
    {
        this.userName = userName;
    }

    @Transient
    @Override
    public Collection<GrantedAuthority> getAuthorities()
    {
        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new GrantedAuthorityImpl("ROLE_USER"));

        return authorities;
    }

    @Transient
    @Override
    public boolean isAccountNonExpired()
    {
        return true;
    }

    @Transient
    @Override
    public boolean isAccountNonLocked()
    {
        return true;
    }

    @Transient
    @Override
    public boolean isCredentialsNonExpired()
    {
        return true;
    }

    @Override
    @Column(name = "USERNAME", nullable = false)
    public String getUsername()
    {
        // TODO Auto-generated method stub
        return this.userName;
    }

    @Override
    @Transient
    public boolean isEnabled()
    {
        return true;
    }

}
