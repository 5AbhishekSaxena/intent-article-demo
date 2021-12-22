package tech.developingdeveloper.intentarticledemo.home.strategy.method_three.oo.sms

import android.content.Intent
import android.net.Uri
import tech.developingdeveloper.intentarticledemo.home.strategy.method_three.oo.SharingIntent

class SmsSharingIntent(
    private val sms: Sms,
    chooserTitle: String = "Please select app to send SMS with",
) : SharingIntent {

    override val intentChooserTitle: String = chooserTitle

    override fun prepareIntent(): Intent = Intent().apply {
        action = Intent.ACTION_VIEW
        data = Uri.parse("sms: ${sms.phoneNumber}")
        putExtra("sms_body", sms.body)
    }
}