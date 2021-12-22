package tech.developingdeveloper.intentarticledemo.home.strategy

import android.content.Context
import tech.developingdeveloper.intentarticledemo.home.strategy.method_three.oo.sms.Sms

interface SharingIntent {
    fun onSmsClick(context: Context, sms: Sms)
    fun onSimpleTextButtonClick(context: Context, text: String)
    fun onWebSharingButtonClick(context: Context, url: String)
}