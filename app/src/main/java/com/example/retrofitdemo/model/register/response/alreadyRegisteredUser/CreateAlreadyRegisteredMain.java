package com.example.retrofitdemo.model.register.response.alreadyRegisteredUser;

public class CreateAlreadyRegisteredMain {
    /*"success":true,
            "statusCode":200,
            "_embedded":{}*/

    private boolean success;
    private int statusCode;
    private CreateAlreadyRegisteredEmbedded _embedded;

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

    public CreateAlreadyRegisteredEmbedded get_embedded() {
        return _embedded;
    }

    public void set_embedded(CreateAlreadyRegisteredEmbedded _embedded) {
        this._embedded = _embedded;
    }
}
