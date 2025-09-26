package com.soa.eda.service

import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.stereotype.Service

@Service
class Producer(private val rabbitTemplate: RabbitTemplate) {

    fun sendMessage(message: String) {
        rabbitTemplate.convertAndSend("notification", message)
        println("Sent: $message")
    }
}