package com.example.retrofitdemo.model.getAllCustomer;

public class AllCustomerListMain {
    /*"success":true,
            "statusCode":200,
            "_embedded":{}*/

    private boolean success;
    int statusCode;
    private AllCustomerListEmbeddedData _embedded;

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

    public AllCustomerListEmbeddedData get_embedded() {
        return _embedded;
    }

    public void set_embedded(AllCustomerListEmbeddedData _embedded) {
        this._embedded = _embedded;
    }
}
