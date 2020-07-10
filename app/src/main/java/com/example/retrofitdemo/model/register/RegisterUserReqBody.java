package com.example.retrofitdemo.model.register;

public class RegisterUserReqBody {
    /*"name":"aws",
            "age":40,
            "emailId":"aws1dd@gmail.com",
            "phoneNumber":"353425435467",
            "address":"India",
            "imagesUrl":"someurl"*/

    private String name = "aws";
    private int age = 40;
    private String emailId = "aws1dd@gmail.com";
    private String phoneNumber = "353425435467";
    private String address = "India";
    private String imagesUrl = "someurl";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImagesUrl() {
        return imagesUrl;
    }

    public void setImagesUrl(String imagesUrl) {
        this.imagesUrl = imagesUrl;
    }
}
