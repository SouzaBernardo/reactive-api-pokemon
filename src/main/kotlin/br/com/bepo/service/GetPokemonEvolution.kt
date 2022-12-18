package br.com.bepo.service

import br.com.bepo.domain.Pokemon
import br.com.bepo.repository.PokemonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GetPokemonEvolution (
    @Autowired
    val pokemonRepository: PokemonRepository
) {
    suspend fun get(pokemonId: Int): Pokemon? {
        // TODO : make a exception to return not found pokemon evolution
        val pokemonIdEvolution = pokemonRepository.findById(pokemonId)?.evolutionId ?: return null
        return pokemonRepository.findById(pokemonIdEvolution)
    }
}