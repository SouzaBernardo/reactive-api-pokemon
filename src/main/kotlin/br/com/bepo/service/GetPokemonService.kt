package br.com.bepo.service

import br.com.bepo.domain.PokemonPostgres
import br.com.bepo.dto.PokemonDTO
import br.com.bepo.repository.mongoRepository.PokemonMongoRepository
import br.com.bepo.repository.postgresRepository.PokemonPostgresRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class GetPokemonService(
    @Autowired
    val pokemonMongoRepository: PokemonMongoRepository,
    @Autowired
    val pokemonPostgresRepository: PokemonPostgresRepository
) {
    fun getAllSimple(): MutableIterable<PokemonPostgres> {
        return pokemonPostgresRepository.findAll()
    }

    fun getAll(): Flux<PokemonDTO> {
        return pokemonMongoRepository.findAll().mapNotNull(PokemonDTO::toDTO)
    }

    fun getById(id: String): Mono<PokemonDTO> {
        return pokemonMongoRepository.findById(id).mapNotNull(PokemonDTO::toDTO)
    }
}
