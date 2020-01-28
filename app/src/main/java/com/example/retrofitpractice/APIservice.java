package com.example.retrofitpractice;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIservice {

    @GET("opendata/assetsCase/6.1.json")
    Call<List<Post>> getPosts();
}
