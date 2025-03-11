package com.example.kotlin.URL.dto

import com.example.kotlin.URL.domain.Url

data class UrlDto (val url : String,) {
    fun toEntity() : Url {
        return Url(url = this.url);
    }
}