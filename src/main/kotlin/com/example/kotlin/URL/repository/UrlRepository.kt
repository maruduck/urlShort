package com.example.kotlin.URL.repository

import com.example.kotlin.URL.domain.Url
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UrlRepository : CrudRepository<Url, Long> {

    fun findByUuid(uuid: String) : Url?;
    fun findByUrl(url: String): Url?;
}