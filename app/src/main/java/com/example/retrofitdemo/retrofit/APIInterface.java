package com.example.retrofitdemo.retrofit;

import com.example.retrofitdemo.model.OtpRequestBody;
import com.example.retrofitdemo.model.getAllCustomer.AllCustomerListMain;
import com.example.retrofitdemo.model.dummy.DemoResponse;
import com.example.retrofitdemo.model.register.RegisterUserReqBody;
import com.example.retrofitdemo.model.register.response.CreateUserMain;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIInterface {
    @GET("customer")
    Call<AllCustomerListMain> getAllCustomer(@Header("Content-Type") String content_type);

    @POST("customer")
    Call<CreateUserMain> createUser(@Body RegisterUserReqBody registerUserReqBody);

    @GET("users/2")
    Call<DemoResponse> getDummyApi();

    /*@GET("users/{user_id}/playlists")
    Call<List<Playlist> getUserPlaylists(@Path(value = "user_id", encoded = true) String userId);
*/
    @GET("customer/{customer_id}/bookings")
    Call<ResponseBody> makeDynamicUrlApiCall(@Path(value = "customer_id", encoded = true) String customerId);

    @POST("user/generate/otp")
    Call<ResponseBody> createOtp(@Query("companyId") String companyId, @Body OtpRequestBody requestBody);


}
