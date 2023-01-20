package br.com.bepo.service

import br.com.bepo.domain.PokemonMongo
import br.com.bepo.repository.mongoRepository.PokemonMongoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class GetPokemonService(
    @Autowired
    val pokemonMongoRepository: PokemonMongoRepository
) {
    fun getAll(): Flux<PokemonMongo> {
        return pokemonMongoRepository.findAll()
    }

}
