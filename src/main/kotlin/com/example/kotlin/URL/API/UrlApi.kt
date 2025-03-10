package com.example.kotlin.URL.API

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("url")
class UrlApi {

    @GetMapping("/")
    fun test() : String {
        return "hello world";
    }
}