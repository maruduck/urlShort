package com.example.kotlin.URL.API

import com.example.kotlin.URL.UrlConfig
import com.example.kotlin.URL.application.UrlService
import com.example.kotlin.URL.domain.Url
import com.example.kotlin.URL.dto.UrlDto
import com.example.kotlin.URL.repository.UrlRepository
import jakarta.servlet.http.HttpServletResponse
import lombok.extern.log4j.Log4j2
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@Log4j2
class UrlApi(
    private val urlService: UrlService,
    private val urlConfig: UrlConfig,) {

    @GetMapping("{uuid}")
    fun redirect(@PathVariable("uuid") uuid: String, res : HttpServletResponse): Unit {
        val url = urlService.findUrl(uuid);
        res.sendRedirect(url);
    }

    @PostMapping
    fun createUrlShort(@RequestBody urlDto : UrlDto) : UrlDto? {

        var url = urlService.createUrl(urlDto);
        return url.toUrlDto(urlConfig.url);
    }
}