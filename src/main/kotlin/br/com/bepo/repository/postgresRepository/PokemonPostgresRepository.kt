package br.com.bepo.repository.postgresRepository

import br.com.bepo.domain.Pokemon
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PokemonPostgresRepository : CrudRepository<Pokemon, Long> {
}