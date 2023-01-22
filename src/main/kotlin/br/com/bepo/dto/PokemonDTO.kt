package br.com.bepo.dto

import br.com.bepo.domain.PokemonMongo

data class PokemonDTO(
    val id: String,
    val pokemonId: Int,
    val name: String,
    val type: String,
    val image: String?,
    val evolution: PokemonDTO?
) {
    companion object {
        fun toDTO(pokemonMongo: PokemonMongo?): PokemonDTO? {

            if (pokemonMongo?.id == null) return null

            val evolution = if (pokemonMongo.evolution != null) toDTO(pokemonMongo.evolution) else null

            return PokemonDTO(
                id = pokemonMongo.id,
                pokemonId = pokemonMongo.pokemonId,
                name = pokemonMongo.name,
                type = pokemonMongo.type,
                image = pokemonMongo.image,
                evolution = evolution
            )
        }
    }
}