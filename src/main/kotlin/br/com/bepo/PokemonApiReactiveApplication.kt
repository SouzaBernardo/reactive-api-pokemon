package br.com.bepo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PokemonApiReactiveApplication

fun main(args: Array<String>) {
	runApplication<PokemonApiReactiveApplication>(*args)
}
