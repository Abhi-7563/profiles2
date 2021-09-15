package com.profiles2.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bankdetails")

public class bankdetails {

    @Id
    private long userId;
    @Column(name = "account_name",nullable = false)
    private String accountname;
    
    @Column(name = "account_number",nullable = false)
    private String accountnumber;

    @Column(name = "account_type",nullable = false,unique = true)
    private String accounttype;

    @Column(name = "IFSCode",nullable = false)
    private String IFSCode;

    @Column(name = "bank_name",nullable = false)
    private String bankname;

    //setter and getters
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }

    public String getIFSCode() {
        return IFSCode;
    }

    public void setIFSCode(String iFSCode) {
        IFSCode = iFSCode;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    //toString()
    @Override
    public String toString() {
        return "bankdetails [IFSCode=" + IFSCode + ", accountname=" + accountname + ", accountnumber=" + accountnumber
                + ", accounttype=" + accounttype + ", bankname=" + bankname + ", userId=" + userId + "]";
    }  

    

    
}
