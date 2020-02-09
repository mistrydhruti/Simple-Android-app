package com.example.dhrutiarunmistry.details;

public class Student {

    private String name;
    private String mobile;
    private String email;
    private String dob;
    private String uid;
    private String address;

    public Student() {
    }

    public Student(String name, String mobile, String email, String dob, String uid, String password) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.dob = dob;
        this.uid = uid;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String password) {
        this.address = address;
    }


}
