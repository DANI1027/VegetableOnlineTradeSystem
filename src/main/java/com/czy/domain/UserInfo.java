package com.czy.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by hu on 2017/3/29.
 */
@Entity
@Table(name = "userInfo")
public class UserInfo {
    @Id
    private long id;
    private String username;
    private String password;
    private String mobilePhoneNumber;


    @Override
    public String toString() {
        return "UserInfo{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", mobilePhoneNumber='" + mobilePhoneNumber + '\'' +
                '}';
    }

    public UserInfo() {
    }

    public UserInfo(long id, String username, String password, String mobilePhoneNumber) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }
}
