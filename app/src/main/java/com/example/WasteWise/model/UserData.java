package com.example.WasteWise;


public class UserData {
    String fullname,username,password,phonenum,email;

    public UserData() {
    }

    public UserData(String fullname, String username, String password, String phonenum, String email) {
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.phonenum = phonenum;
        this.email = email;

    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public String getEmail() {
        return email;
    }

}