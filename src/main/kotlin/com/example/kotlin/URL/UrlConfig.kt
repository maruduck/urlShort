package com.example.kotlin.URL

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration

@Configuration
class UrlConfig {

    @Value("\${app.url}")
    lateinit var url : String;

}