package com.example.kotlin.URL.application

import com.example.kotlin.URL.domain.Url
import com.example.kotlin.URL.dto.UrlDto
import com.example.kotlin.URL.repository.UrlRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class UrlService(
    private val urlRepository: UrlRepository
) {

    @Transactional
    fun createUrl(urlDto: UrlDto) : Url {
        var savedUrl = urlRepository.save(urlDto.toEntity());
        savedUrl.createUUID();
        return savedUrl;
    }

    fun findUrl(uuid: String): String? {
        val saveUrl = urlRepository.findByUuid(uuid);
        return saveUrl?.url
    }
}