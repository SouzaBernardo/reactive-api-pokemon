package br.com.bepo.config.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties("spring.jdbc")
class PostgresProperties {
    lateinit var url: String
    lateinit var username: String
    lateinit var password: String
}