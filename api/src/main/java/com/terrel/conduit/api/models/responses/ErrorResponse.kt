package com.terrel.conduit.api.models.responses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.terrel.conduit.api.models.enitities.Errors

@JsonClass(generateAdapter = true)
data class ErrorResponse(
    @Json(name = "errors")
    val errors: Errors
)