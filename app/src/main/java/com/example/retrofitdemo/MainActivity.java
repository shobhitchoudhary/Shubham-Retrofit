package com.example.retrofitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.retrofitdemo.model.Blogs.BlogsMainPojo;
import com.example.retrofitdemo.model.OtpRequestBody;
import com.example.retrofitdemo.model.getAllCustomer.AllCustomerListMain;
import com.example.retrofitdemo.model.dummy.DemoResponse;
import com.example.retrofitdemo.model.register.RegisterUserReqBody;
import com.example.retrofitdemo.model.register.response.CreateUserMain;
import com.example.retrofitdemo.model.register.response.alreadyRegisteredUser.CreateAlreadyRegisteredMain;
import com.example.retrofitdemo.retrofit.APIClient;
import com.example.retrofitdemo.retrofit.APIInterface;
import com.google.gson.Gson;

import java.util.ArrayList;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {
    private final String TAG = this.getClass().getSimpleName();
    private APIInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface = APIClient.getClient().create(APIInterface.class);
        //getDynamicResponseData();
        //createUser();
        //getAllCustomer();
        //getDummyApi();
        //createOtp();
        getBlogsPost();
    }

    private void getBlogsPost(){
        Call<ArrayList<BlogsMainPojo>> call = apiInterface.getBlogs(1,10);
        call.enqueue(new Callback<ArrayList<BlogsMainPojo>>() {
            @Override
            public void onResponse(Call<ArrayList<BlogsMainPojo>> call, Response<ArrayList<BlogsMainPojo>> response) {
                System.out.println(TAG+"blogs response = "+response);
            }

            @Override
            public void onFailure(Call<ArrayList<BlogsMainPojo>> call, Throwable t) {
                System.out.println(TAG+"blogs error = "+t.getMessage());
            }
        });
    }

    private void getDynamicResponseData(){
        Call<ResponseBody> call =  apiInterface.makeDynamicUrlApiCall("s8L3Rg690Q");
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                System.out.println(TAG+"dynamic user response = "+response.body());

            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                System.out.println(TAG+"dynamic user  error = "+t.getMessage());

            }
        });
    }

    private void createUser() {
        final RegisterUserReqBody registerUserReqBody = new RegisterUserReqBody();
        registerUserReqBody.setPhoneNumber("5489504764940");
        Call<CreateUserMain> call = apiInterface.createUser(registerUserReqBody);
        call.enqueue(new Callback<CreateUserMain>() {
            @Override
            public void onResponse(Call<CreateUserMain> call, Response<CreateUserMain> response) {
                System.out.println(TAG+"register user response = "+response);

                if (response.isSuccessful()){
                    // New User
                    System.out.println(TAG+"register new user response = "+response.body());
                    CreateUserMain createAlreadyRegisteredMain = response.body();
                }else { // Existing User
                    Gson gson = new Gson();
                    CreateAlreadyRegisteredMain createAlreadyRegisteredMain = gson.fromJson(response.errorBody().charStream(),CreateAlreadyRegisteredMain.class);
                    System.out.println(TAG+"already registered user = "+createAlreadyRegisteredMain);
                }
            }

            @Override
            public void onFailure(Call<CreateUserMain> call, Throwable t) {
                System.out.println(TAG+"register user  error = "+t.getMessage());
            }
        });
    }

    private void getAllCustomer(){
        Call<AllCustomerListMain> call = apiInterface.getAllCustomer("application/json");
        call.enqueue(new Callback<AllCustomerListMain>() {
            @Override
            public void onResponse(Call<AllCustomerListMain> call, Response<AllCustomerListMain> response) {
                System.out.println(TAG+"all customer response = "+response);
            }

            @Override
            public void onFailure(Call<AllCustomerListMain> call, Throwable t) {
                System.out.println(TAG+"all customer  error = "+t.getMessage());
            }
        });
    }

    private void getDummyApi(){
        Call<DemoResponse> call = apiInterface.getDummyApi();
        call.enqueue(new Callback<DemoResponse>() {
            @Override
            public void onResponse(Call<DemoResponse> call, Response<DemoResponse> response) {
                System.out.println(TAG+" demo response = "+response);
            }

            @Override
            public void onFailure(Call<DemoResponse> call, Throwable t) {
                System.out.println(TAG+" demo error = "+t.getMessage());
            }
        });
    }

    private void createOtp(){
        OtpRequestBody requestBody = new OtpRequestBody();
        requestBody.setMobileCountryCode("+91");
        requestBody.setMobileNo("8553893393");
        Call<ResponseBody> call = apiInterface.createOtp("53e7f0d9-4711-4c21-bcd1-cf76354e771e",requestBody);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                System.out.println(TAG+" get otp response = "+response);
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                System.out.println(TAG+" get otp error = "+t.getMessage());
            }
        });
    }
}