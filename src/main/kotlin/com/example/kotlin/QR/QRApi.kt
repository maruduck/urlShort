package com.example.kotlin.QR

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class QRApi(val qrService: QRService) {

    @PostMapping("qr")
    fun QRmake(@RequestBody qrDto: QRDto) : Unit {
        qrService.QRMake(qrDto.url);
    }

}