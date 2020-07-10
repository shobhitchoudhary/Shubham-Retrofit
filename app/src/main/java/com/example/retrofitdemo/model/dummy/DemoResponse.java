package com.example.retrofitdemo.model.dummy;

public class DemoResponse {
    /*"data":{},
            "ad":{}*/

    DemoData data;
    DemoAd ad;

    public DemoData getData() {
        return data;
    }

    public void setData(DemoData data) {
        this.data = data;
    }

    public DemoAd getAd() {
        return ad;
    }

    public void setAd(DemoAd ad) {
        this.ad = ad;
    }
}
