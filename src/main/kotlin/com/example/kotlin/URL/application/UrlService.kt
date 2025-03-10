package com.example.kotlin.URL.application

import com.example.kotlin.URL.repository.UrlRepository
import org.springframework.stereotype.Service

@Service
class UrlService(
    private val urlRepository: UrlRepository
) {

}