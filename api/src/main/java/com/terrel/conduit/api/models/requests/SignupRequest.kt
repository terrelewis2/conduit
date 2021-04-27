package com.terrel.conduit.api.models.requests


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.terrel.conduit.api.models.enitities.UserCreds

@JsonClass(generateAdapter = true)
data class SignupRequest(
    @Json(name = "user")
    val user: UserCreds
)