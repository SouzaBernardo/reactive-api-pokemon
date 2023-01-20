package br.com.bepo.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class PokemonMongo (
    @Id
    val id: String?,
    val pokemonId: Int,
    val name: String,
    val type: String,
    val image: String?,
    val evolutionId: Int?
)