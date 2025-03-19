package com.example.kotlin.QR

import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.awt.image.BufferedImage

@RestController
class QRApi(val qrService: QRService) {

    @PostMapping("qr")
    fun QRmake(@RequestBody qrDto: QRDto) : ResponseEntity<ByteArray> {
        val image : ByteArray = qrService.QRMake(qrDto.url);

        return ResponseEntity
            .status(HttpStatus.OK)
            .contentType(MediaType.IMAGE_PNG)
            .body(image);
    }

}