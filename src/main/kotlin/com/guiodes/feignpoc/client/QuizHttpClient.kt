package com.guiodes.feignpoc.client

import com.guiodes.feignpoc.config.feign.QuizHttpClientConfiguration
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(
    name = "quiz",
    url = "\${api.quiz.host}",
    configuration = [QuizHttpClientConfiguration::class]
)
interface QuizHttpClient {

    @GetMapping("/quiz")
    fun getQuiz(): List<String>
}