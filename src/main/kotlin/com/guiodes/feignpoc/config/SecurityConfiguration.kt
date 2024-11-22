package com.guiodes.feignpoc.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.DefaultSecurityFilterChain

@Configuration
class SecurityConfiguration {

    @Bean
    fun httpSecurity(http: HttpSecurity): DefaultSecurityFilterChain = http.csrf { it.disable() }
        .authorizeHttpRequests { it.anyRequest().permitAll() }.build()
}