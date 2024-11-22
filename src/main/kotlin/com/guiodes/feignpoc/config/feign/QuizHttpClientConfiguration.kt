package com.guiodes.feignpoc.config.feign

import feign.RequestInterceptor
import feign.RequestTemplate
import org.springframework.web.client.RestTemplate

class QuizHttpClientConfiguration: RequestInterceptor {

    override fun apply(request: RequestTemplate) {
        request.header("Authorization", "Bearer ${retrieveToken()}")
    }

    private fun retrieveToken(): String {
        val restTemplate = RestTemplate()
        val loginUrl = "https://api-teste-a.5lsiua.easypanel.host/login"
        val body = mapOf(
            "username" to "gui@gui.com",
            "password" to "123"
        )

        return restTemplate.postForObject(loginUrl, body, Map::class.java)?.get("authToken") as String
    }
}
