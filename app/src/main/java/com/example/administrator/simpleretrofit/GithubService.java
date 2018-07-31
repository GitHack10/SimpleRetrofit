package com.example.administrator.simpleretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;

public interface GithubService {

    @GET("users")
    Call<List<User>> getUsers();

}