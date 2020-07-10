package com.example.retrofitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.retrofitdemo.model.getAllCustomer.AllCustomerListMain;
import com.example.retrofitdemo.model.dummy.DemoResponse;
import com.example.retrofitdemo.model.register.RegisterUserReqBody;
import com.example.retrofitdemo.model.register.response.CreateUserMain;
import com.example.retrofitdemo.model.register.response.alreadyRegisteredUser.CreateAlreadyRegisteredMain;
import com.example.retrofitdemo.retrofit.APIClient;
import com.example.retrofitdemo.retrofit.APIInterface;
import com.google.gson.Gson;

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
        createUser();
        //getAllCustomer();
        //getDummyApi();
    }

    private void createUser() {
        RegisterUserReqBody registerUserReqBody = new RegisterUserReqBody();
        registerUserReqBody.setPhoneNumber("5489504764940");
        Call<CreateUserMain> call = apiInterface.createUser(registerUserReqBody);
        call.enqueue(new Callback<CreateUserMain>() {
            @Override
            public void onResponse(Call<CreateUserMain> call, Response<CreateUserMain> response) {
                System.out.println(TAG+"register user response = "+response);

                if (response.isSuccessful()){
                    // New User
                    System.out.println(TAG+"register new user response = "+response.body());
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
}