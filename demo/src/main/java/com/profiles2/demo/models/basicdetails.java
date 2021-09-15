package com.profiles2.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "basicdetails")

public class basicdetails {

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "phone_number",nullable = false,unique = true)
    private String phonenumber;
    @Column(name = "email",nullable = false,unique = true)
    private String email;

    //setter and getters
    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //toString()
    @Override
    public String toString() {
        return "basicdetails [email=" + email + ", name=" + name + ", phonenumber=" + phonenumber + ", userId=" + userId
                + "]";
    }
    
    
    
}
