package com.example.kotlin.QR

import com.google.zxing.BarcodeFormat
import com.google.zxing.EncodeHintType
import com.google.zxing.client.j2se.MatrixToImageConfig
import com.google.zxing.client.j2se.MatrixToImageWriter
import com.google.zxing.common.BitMatrix
import com.google.zxing.qrcode.QRCodeWriter
import org.springframework.stereotype.Service
import java.awt.image.BufferedImage

@Service
class QRService {
    fun QRMake(url: String) : BufferedImage {
        val qrCodeWriter: QRCodeWriter = QRCodeWriter();
        var hints: HashMap<EncodeHintType, Any> = HashMap();
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        var QR : BitMatrix = qrCodeWriter.encode(url, BarcodeFormat.QR_CODE, 512, 512, hints);

        return MatrixToImageWriter.toBufferedImage(QR, MatrixToImageConfig());
    }
}