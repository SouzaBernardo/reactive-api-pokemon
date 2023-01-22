package br.com.bepo.controller

import br.com.bepo.dto.PokemonDTO
import br.com.bepo.service.GetPokemonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/pokemons")
class PokemonController (
    @Autowired
    val getPokemonService: GetPokemonService
) {

    @GetMapping
    suspend fun getPokemons(): Flux<PokemonDTO> {
        return getPokemonService.getAll()
    }
}