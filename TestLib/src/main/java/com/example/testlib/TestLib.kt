package com.example.testlib

import android.content.res.Resources
import android.graphics.ImageDecoder
import androidx.annotation.DrawableRes

class TestLib {
    companion object{
        fun loadImageRes(res: Resources, @DrawableRes id: Int ){
            val source = ImageDecoder.createSource(res, id)

            val bitmap = ImageDecoder.decodeBitmap(source){ imageDecoder, imageInfo, source ->
                val w = 100
                val h = 100
                imageDecoder.setTargetSize(w, h)
            }
        }
    }
}