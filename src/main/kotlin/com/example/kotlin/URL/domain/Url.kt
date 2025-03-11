package com.example.kotlin.URL.domain

import com.example.kotlin.URL.dto.UrlDto
import jakarta.persistence.*

@Entity
data class Url (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null,
    @Column var uuid : String? = null,
    @Column var url : String,
    @Column var cnt : Int = 0,
) {

    fun createUUID() {
        this.uuid = id?.toString(36);
    }
}