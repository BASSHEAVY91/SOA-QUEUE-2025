package com.soa.eda.config

import org.springframework.amqp.core.Queue
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RabbitConfig {

    @Bean
    fun demoQueue(): Queue {
        return Queue("notification", true)
    }
}
