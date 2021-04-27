package com.terrel.conduit.api.models.responses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.terrel.conduit.api.models.enitities.Article

@JsonClass(generateAdapter = true)
data class ArticleResponse(
    @Json(name = "article")
    val article: Article
)