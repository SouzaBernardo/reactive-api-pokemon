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
		runBlocking { pokemonMongoRepository.deleteAll() }

		runBlocking {

			val pokemonList = listOf(
				PokemonMongo("a", 1, "Pichu", "ELECTRIC", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/172.png",
					PokemonMongo("b", 2, "Pikachu", "ELECTRIC", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/025.png",
						PokemonMongo("c", 3, "Raichu", "ELECTRIC", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/026.png", null))),
				PokemonMongo("b", 2, "Pikachu", "ELECTRIC", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/025.png",
					PokemonMongo("c", 3, "Raichu", "ELECTRIC", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/026.png", null)),
				PokemonMongo("c", 3, "Raichu", "ELECTRIC", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/026.png", null)
			)
			val saved = pokemonMongoRepository.saveAll(pokemonList)

			val first = saved.blockFirst()!!

			println("id: ${first.id}, name: ${first.name}, evolution name: ${first.evolution?.name}")
		}
	}
}

fun main(args: Array<String>) {
	runApplication<PokemonApiReactiveApplication>(*args)
}
