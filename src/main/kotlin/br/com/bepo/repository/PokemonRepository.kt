package br.com.bepo.repository

import br.com.bepo.domain.Pokemon
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface PokemonRepository : CoroutineCrudRepository<Pokemon, Int> {
}