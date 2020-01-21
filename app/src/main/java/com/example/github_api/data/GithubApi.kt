package com.example.github_api.data

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubApi {

    @GET("users/{owner}/repos")
    fun getRepos(@Path("owner") owner: String) : Single<ArrayList<GithubRepo>>

}