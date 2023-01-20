package br.com.bepo.repository.mongoRepository

import br.com.bepo.domain.PokemonMongo
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PokemonMongoRepository : ReactiveMongoRepository<PokemonMongo, String> {

}
