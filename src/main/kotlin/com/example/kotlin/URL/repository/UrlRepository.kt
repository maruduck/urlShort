package com.example.kotlin.URL.repository

import com.example.kotlin.URL.domain.Url
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UrlRepository : CrudRepository<Url, Long> {

}