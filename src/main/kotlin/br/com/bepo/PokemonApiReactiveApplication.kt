package br.com.bepo

import br.com.bepo.domain.PokemonMongo
import br.com.bepo.repository.mongoRepository.PokemonMongoRepository
import kotlinx.coroutines.runBlocking
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class PokemonApiReactiveApplication {
	@Bean
	fun runner(pokemonMongoRepository: PokemonMongoRepository) = ApplicationRunner {
		runBlocking {
			val pokemonList = listOf(
				PokemonMongo(null, 1, "Pichu", "ELECTRIC", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/172.png", 2),
				PokemonMongo(null, 2, "Pikachu", "ELECTRIC", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/025.png", 3),
				PokemonMongo(null, 3, "Pichu", "ELECTRIC", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/026.png", null)
			)
			val saved = pokemonMongoRepository.saveAll(pokemonList)

			println(saved.blockLast()?.id)
		}
	}
}

fun main(args: Array<String>) {
	runApplication<PokemonApiReactiveApplication>(*args)
}
