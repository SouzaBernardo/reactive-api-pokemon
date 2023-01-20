package br.com.bepo.repository.postgresRepository

import br.com.bepo.domain.PokemonPostgres
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PokemonPostgresRepository : CrudRepository<PokemonPostgres, Long> {
}