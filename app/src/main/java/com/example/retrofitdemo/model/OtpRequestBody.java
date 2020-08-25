package com.example.retrofitdemo.model;

public class OtpRequestBody {
    /*"mobileCountryCode":"+91",
"mobileNo":"8553893393"*/

    private String mobileCountryCode = "",mobileNo="";

    public String getMobileCountryCode() {
        return mobileCountryCode;
    }

    public void setMobileCountryCode(String mobileCountryCode) {
        this.mobileCountryCode = mobileCountryCode;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
