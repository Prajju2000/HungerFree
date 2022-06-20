package com.example.aahaarapp;

public class model {
    String name,type,phone,description,userid;

    public model() {

    }

    public model(String name, String type,String phone, String description, String userid) {
        this.name = name;
        this.type = type;
        this.phone=phone;
        this.description = description;
        this.userid = userid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
