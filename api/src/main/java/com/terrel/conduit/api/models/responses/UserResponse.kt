package com.terrel.conduit.api.models.responses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.terrel.conduit.api.models.enitities.User

@JsonClass(generateAdapter = true)
data class UserResponse(
    @Json(name = "user")
    val user: User
)