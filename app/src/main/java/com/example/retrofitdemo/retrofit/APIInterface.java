package com.example.retrofitdemo.retrofit;

import com.example.retrofitdemo.model.getAllCustomer.AllCustomerListMain;
import com.example.retrofitdemo.model.dummy.DemoResponse;
import com.example.retrofitdemo.model.register.RegisterUserReqBody;
import com.example.retrofitdemo.model.register.response.CreateUserMain;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface APIInterface {
    @GET("customer")
    Call<AllCustomerListMain> getAllCustomer(@Header("Content-Type") String content_type);

    @POST("customer")
    Call<CreateUserMain> createUser(@Body RegisterUserReqBody registerUserReqBody);

    @GET("users/2")
    Call<DemoResponse> getDummyApi();
}
