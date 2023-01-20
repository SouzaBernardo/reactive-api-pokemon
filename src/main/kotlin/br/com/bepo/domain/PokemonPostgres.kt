package br.com.bepo.domain

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table


@Table("pokemon")
data class PokemonPostgres (
    @Id
    val id: Int?,
    val name: String,
    val type: String,
    val image: String?,
    val evolutionId: Int?
)
