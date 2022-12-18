package br.com.bepo.controller

import br.com.bepo.domain.Pokemon
import br.com.bepo.repository.PokemonRepository
import br.com.bepo.service.GetPokemonEvolution
import kotlinx.coroutines.flow.Flow
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/pokemons")
class PokemonController(
    @Autowired
    val pokemonRepository: PokemonRepository,
    @Autowired
    val getPokemonEvolution: GetPokemonEvolution
) {

    @GetMapping
    fun getAll(): Flow<Pokemon> {
        return pokemonRepository.findAll()
    }

    @GetMapping("/{id}/evolution")
    suspend fun getEvolutionByPokemonId(@PathVariable id: Int): Pokemon?{
        return getPokemonEvolution.get(id)
    }
}