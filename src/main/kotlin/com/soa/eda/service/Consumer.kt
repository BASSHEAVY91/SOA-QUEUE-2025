package com.soa.eda.service

import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Service

@Service
class Consumer {

    @RabbitListener(queues = ["notification"])
    fun receiveMessage(message: String) {
        println("Received: $message")
    }
}

