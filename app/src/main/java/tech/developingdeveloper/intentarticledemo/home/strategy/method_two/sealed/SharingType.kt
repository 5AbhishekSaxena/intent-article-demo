package tech.developingdeveloper.intentarticledemo.home.strategy.method_two.sealed

import tech.developingdeveloper.intentarticledemo.home.strategy.method_three.oo.sms.Sms

sealed class SharingType {
    data class Default(val text: String) : SharingType()
    data class SmsType(val sms: Sms) : SharingType()
    data class WebBrowserType(val url: String) : SharingType()
}
