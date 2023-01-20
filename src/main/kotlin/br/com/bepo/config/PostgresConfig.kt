package br.com.bepo.config

import br.com.bepo.config.properties.MongoProperties
import br.com.bepo.config.properties.PostgresProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource

@Configuration
@EnableConfigurationProperties(PostgresProperties::class)
class PostgresConfig(val postgresProperties: PostgresProperties) {

    @Bean
    fun dataSource(): DataSource {
        return DataSourceBuilder.create()
            .url(postgresProperties.url)
            .username(postgresProperties.username)
            .password(postgresProperties.password)
            .build()
    }
}