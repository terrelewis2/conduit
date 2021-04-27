package com.terrel.conduit.api.models.responses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.terrel.conduit.api.models.enitities.Comment

@JsonClass(generateAdapter = true)
data class CommentsResponse(
    @Json(name = "comments")
    val comments: List<Comment>
)