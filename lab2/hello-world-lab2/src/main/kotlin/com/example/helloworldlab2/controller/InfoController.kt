package com.example.helloworldlab2.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/info")
class InfoController {

    @GetMapping("")
    fun infoPage(): String {
        return "info"
    }
}