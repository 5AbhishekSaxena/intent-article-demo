package tech.developingdeveloper.intentarticledemo.home.strategy.method_three.oo

import android.content.Intent

interface SharingIntent {
    val intentChooserTitle: String
    fun prepareIntent(): Intent
}