package com.terrel.conduit.api.services

import com.terrel.conduit.api.models.enitities.UserCreds
import com.terrel.conduit.api.models.requests.SignupRequest
import com.terrel.conduit.api.models.responses.ArticlesResponse
import com.terrel.conduit.api.models.responses.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ConduitAPI {

    @POST("users")
    suspend fun signupUser(
        @Body userCreds: SignupRequest
    ): Response<UserResponse>

    @GET("articles")
    suspend fun getArticles(
        @Query("author") author: String? = null,
        @Query("favorited") favorited: String? = null,
        @Query("tag") tag: String? = null,
    ): Response<ArticlesResponse>
}