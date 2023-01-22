package br.com.bepo.dto

import br.com.bepo.domain.PokemonMongo

data class PokemonDTO (
    val id: String,
    val pokemonId: Int,
    val name: String,
    val type: String,
    val image: String?,
    val evolutionId: Int?
) {
    companion object {
        fun toDTO(pokemonMongo: PokemonMongo) = PokemonDTO(
            id = pokemonMongo.id!!,
            pokemonId = pokemonMongo.pokemonId,
            name = pokemonMongo.name,
            type = pokemonMongo.type,
            image = pokemonMongo.image,
            evolutionId = pokemonMongo.evolutionId
        )
    }
}