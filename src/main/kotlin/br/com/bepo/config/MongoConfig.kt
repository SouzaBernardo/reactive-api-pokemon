package br.com.bepo.config

import br.com.bepo.config.properties.MongoProperties
import com.mongodb.reactivestreams.client.MongoClient
import com.mongodb.reactivestreams.client.MongoClients
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration

@Configuration
@EnableConfigurationProperties(MongoProperties::class)
class MongoConfig(val mongoProperties: MongoProperties) : AbstractReactiveMongoConfiguration() {
    override fun reactiveMongoClient(): MongoClient = MongoClients.create(mongoProperties.uri)
    override fun getDatabaseName(): String = mongoProperties.database
}