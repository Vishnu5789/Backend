package com.ecommerce.ecomsystem.model;

import jakarta.persistence.*;

@Entity
@Table(name="Login_Data")
public class LoginData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;

    @Column(name="phone",nullable = false,unique = true)
    private long phone;

    @Column(name="Name",nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="email",nullable = false,unique = true)
    private String email;

    @Column(name="Password",nullable = false)
    private String password;

    @Column(name="Confirm Password",nullable = false)
    private String confirmPassword;

    public LoginData() {
    }

    public LoginData(int id, long phone, String name, String email, String password, String confirmPassword) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
