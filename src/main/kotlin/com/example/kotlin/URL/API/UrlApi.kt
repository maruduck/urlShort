package com.example.kotlin.URL.API

import com.example.kotlin.URL.application.UrlService
import com.example.kotlin.URL.domain.Url
import com.example.kotlin.URL.dto.UrlDto
import com.example.kotlin.URL.repository.UrlRepository
import lombok.extern.log4j.Log4j2
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("url")
@Log4j2
class UrlApi(private val urlService: UrlService) {

    @GetMapping
    fun test(): String {
        return "hello";
    }

    @PostMapping
    fun createUrlShort(@RequestBody urlDto : UrlDto) : String {

        var url = urlService.createUrl(urlDto);
        print(url);
        return "hello world";
    }
}