package com.terrel.conduit.api

import com.terrel.conduit.api.models.enitities.UserCreds
import com.terrel.conduit.api.models.requests.SignupRequest
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import kotlinx.coroutines.runBlocking
import org.junit.Test
import kotlin.random.Random

class ConduitClientTests {

    private val conduitClient = ConduitClient()

    @Test
    fun `GET articles`() {
        runBlocking {
            val articles = conduitClient.api.getArticles()
            assertNotNull(articles.body()?.articles)
        }
    }

    @Test
    fun `GET articles by author`() {
        runBlocking {
            val articles = conduitClient.api.getArticles(author = "444")
            assertNotNull(articles.body()?.articles)
        }
    }

    @Test
    fun `GET articles favourited by username`() {
        runBlocking {
            val articles = conduitClient.api.getArticles(favorited = "tlewis2594")
            assertNotNull(articles.body()?.articles)
        }
    }

    @Test
    fun `GET articles by tags`() {
        runBlocking {
            val articles = conduitClient.api.getArticles(tag = "js")
            assertNotNull(articles.body()?.articles)
        }
    }

    @Test
    fun `POST users-Sign up user`() {
        val userCreds = UserCreds(
            email = "testmail${Random.nextInt(999, 9999)}@test.com",
            password = "pass${Random.nextInt(9999, 99999)}",
            username = "testuser${Random.nextInt(999, 9999)}"
        )
        runBlocking {
            val resp = conduitClient.api.signupUser(
                SignupRequest(
                    userCreds
                )
            )
            assertEquals(userCreds.email, resp.body()?.user?.email)
        }
    }
}