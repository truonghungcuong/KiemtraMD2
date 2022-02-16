package com.codegym.model;

import java.io.Serializable;

public class Personinfo implements Serializable {
    private String phonenumber;
    private String group;
    private String name;
    private String sex;
    private String address;
    private String dateofbirth;
    private String email;

    public Personinfo(){

    }
    public Personinfo(String phonenumber, String group, String name, String sex, String address, String dateofbirth, String email) {
        this.phonenumber = phonenumber;
        this.group = group;
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.dateofbirth = dateofbirth;
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Số điện thoại: "+phonenumber+", "+"Nhóm danh bạ: "+group+", "+"Tên: "+name+", "+"Địa chỉ: "+address+", "+"Email: "+email;
    }
}
