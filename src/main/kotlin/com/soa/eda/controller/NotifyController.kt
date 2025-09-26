package com.soa.eda.controller

import com.soa.eda.service.Producer
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/notify")
class DemoController(private val producer: Producer) {

    @PostMapping
    fun send(@RequestParam msg: String) = producer.sendMessage(msg)
}