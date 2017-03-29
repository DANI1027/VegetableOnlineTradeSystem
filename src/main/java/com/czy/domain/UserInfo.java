package com.czy.domain;

import javax.persistence.*;

/**
 * Created by hu on 2017/3/29.
 */
@Entity
@Table(name = "userInfo")
public class UserInfo {

    @Id
    @GeneratedValue
    private long userId;
    private String username;
    private String password;
    private String mobilePhoneNumber;
    private boolean isAdmin;

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId =" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", mobilePhoneNumber='" + mobilePhoneNumber + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }

    public UserInfo() {
    }

    public UserInfo(String username, String password, String mobilePhoneNumber) {
        this.username = username;
        this.password = password;
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public long getUserId() {
        return userId;
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

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
