package com.example.retrofitdemo.model.getAllCustomer;

public class EmbeddedItem {
    /*"id":"XC18A9EiwK",
            "name":"Navneet",
            "age":40,
            "emailId":"navneet@gmail.com",
            "phoneNumber":"1234567890",
            "address":"UP",
            "imageUrl":null*/
    private String id="",name="",emailId="",phoneNumber="",imageUrl="";
    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
