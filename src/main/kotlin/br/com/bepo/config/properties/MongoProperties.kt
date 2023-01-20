package br.com.bepo.config.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties("spring.data.mongodb")
class MongoProperties {
    lateinit var uri: String
    lateinit var database: String
}