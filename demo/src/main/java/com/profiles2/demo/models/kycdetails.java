package com.profiles2.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kycdetails")

public class kycdetails {

    @Id
    private long userId;
    @Column(name = "father_name",nullable = false)
    private String fathername;

    @Column(name = "aaadress",nullable = false)
    private String address;

    @Column(name = "pan_card",nullable = false,unique = true)
    private String pancard;
    
    @Column(name = "adhar_card",nullable = false,unique = true)
    private String adharcard;

    //setter and getters
    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }
    public String getFathername() {
        return fathername;
    }
    public void setFathername(String fathername) {
        this.fathername = fathername;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPancard() {
        return pancard;
    }
    public void setPancard(String pancard) {
        this.pancard = pancard;
    }
    public String getAdharcard() {
        return adharcard;
    }
    public void setAdharcard(String adharcard) {
        this.adharcard = adharcard;
    }

    //toString()
    @Override
    public String toString() {
        return "kycdetails [address=" + address + ", adharcard=" + adharcard + ", fathername=" + fathername
                + ", pancard=" + pancard + ", userId=" + userId + "]";
    }   

    
    
}
