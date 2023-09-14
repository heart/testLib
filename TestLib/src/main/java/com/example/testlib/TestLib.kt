package com.example.testlib

import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.ImageDecoder
import androidx.annotation.DrawableRes

public class TestLib {
    companion object{
        public fun loadImageRes(res: Resources, @DrawableRes id: Int, width: Int, height: Int ): Bitmap {
            val source = ImageDecoder.createSource(res, id)

            return ImageDecoder.decodeBitmap(source){ imageDecoder, imageInfo, source ->
                val w = 100
                val h = 100
                imageDecoder.setTargetSize(w, h)
            }
        }
    }
}