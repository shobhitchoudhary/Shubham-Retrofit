package com.example.retrofitdemo.model.register.response.alreadyRegisteredUser;

public class CreateAlreadyRegisteredItem {

    /*"message":"DUPLICATE RECORD",
            "details":[]*/

    private String message = "";
    private String[] details;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String[] getDetails() {
        return details;
    }

    public void setDetails(String[] details) {
        this.details = details;
    }
}
