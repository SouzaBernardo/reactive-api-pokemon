package br.com.bepo.domain

import org.springframework.data.annotation.Id

data class Pokemon (
    @Id
    val id: Int?,
    val name: String,
    val type: String,
    val image: String?,
    val evolutionId: Int?
)