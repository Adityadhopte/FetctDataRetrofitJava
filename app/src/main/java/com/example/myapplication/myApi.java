package com.example.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface myApi {

    @GET("posts")
    Call<List<Model>> getmodels();

    @GET("select.php")
    Call<List<ServerResponce>> getServerResponce();
}
