package com.example.kotlin.URL.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class Url (
    @Id var uuid: String?,
    @Column var url : String,
)