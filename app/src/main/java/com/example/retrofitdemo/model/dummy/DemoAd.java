package com.example.retrofitdemo.model.dummy;

public class DemoAd {
    /*"company":"StatusCode Weekly",
"url":"http://statuscode.org/",
"text":"A weekly newsletter focusing on software development, infrastructure, the server, performance, and the stack end of things."*/

    private String company="",url="",text="";

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
