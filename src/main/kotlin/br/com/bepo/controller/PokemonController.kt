package br.com.bepo.controller

import br.com.bepo.domain.PokemonPostgres
import br.com.bepo.dto.PokemonDTO
import br.com.bepo.service.GetPokemonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/pokemons")
class PokemonController (
    @Autowired
    val getPokemonService: GetPokemonService
) {

    @GetMapping("/simple")
    suspend fun getAllPokemonsSimple(): MutableIterable<PokemonPostgres> {
        return getPokemonService.getAllSimple()
    }

    @GetMapping
    suspend fun getAllPokemons(): Flux<PokemonDTO> {
        return getPokemonService.getAll()
    }

    @GetMapping("/{id}")
    suspend fun getPokemonById(@PathVariable id: String): Mono<PokemonDTO> {
        return getPokemonService.getById(id)
    }
}