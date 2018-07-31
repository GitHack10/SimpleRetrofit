package com.example.administrator.simpleretrofit;

import com.google.gson.annotations.SerializedName;

public class User {

    // Сравниваем
    @SerializedName("id")
    private int id;
    @SerializedName("login")
    private String login;
    @SerializedName("avatar_url")
    private String avatarUrl;
    @SerializedName("location")
    private String location;
    @SerializedName("name")
    private String name;
    @SerializedName("public_repos")
    private String publicRepos;
    @SerializedName("followers")
    private String followers;
    @SerializedName("following")
    private String following;
}