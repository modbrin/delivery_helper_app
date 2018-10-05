package ru.innopolis.deliveryhelper.model;

import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("available_orders")
    Call<List<ItemResponseModel>> getOrders(@Header("Token") String token);

    @POST("login")
    Call<LoginResponseModel> login(@Body RequestBody credentials);
}