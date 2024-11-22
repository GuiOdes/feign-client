package com.guiodes.feignpoc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class FeignPocApplication

fun main(args: Array<String>) {
	runApplication<FeignPocApplication>(*args)
}
