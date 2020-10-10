package com.example.retrofitdemo.retrofit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {

    private static String BASE_URL = "https://5e99a9b1bc561b0016af3540.mockapi.io/jet2/api/v1/";
    //private static String BASE_URL = "https://apiqa.odigolive.com/business/services/";
    //private static String BASE_URL = "http://3.6.250.26/mhomecare/";
    //private static String BASE_URL = "https://reqres.in/api/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(APIClient.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()) //Here we are using the GsonConverterFactory to directly convert json data to object
                .build();

        return retrofit;
    }

}
