package com.example.retrofitdemo.model.register.response;

public class CreateUserMain {
    /*"success":true,
            "statusCode":200,
            "_embedded":{}*/

    private boolean success;
    private int statusCode;
    private CreateUserData _embedded;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public CreateUserData get_embedded() {
        return _embedded;
    }

    public void set_embedded(CreateUserData _embedded) {
        this._embedded = _embedded;
    }
}
