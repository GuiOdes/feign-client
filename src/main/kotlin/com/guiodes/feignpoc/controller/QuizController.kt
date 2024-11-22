package com.guiodes.feignpoc.controller

import com.guiodes.feignpoc.client.QuizHttpClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/quiz")
class QuizController(
    private val quizHttpClient: QuizHttpClient
) {

    @GetMapping
    fun getQuiz() = quizHttpClient.getQuiz()
}