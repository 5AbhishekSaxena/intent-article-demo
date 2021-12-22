package tech.developingdeveloper.intentarticledemo.home.strategy.method_two.sealed

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.core.app.ShareCompat
import androidx.core.net.toUri

class SharingIntentFactory {

    fun prepareIntent(context: Context, sharingType: SharingType): Intent {
        return when (sharingType) {
            is SharingType.Default -> {
                ShareCompat.IntentBuilder(context)
                    .setType("text/plain")
                    .setText(sharingType.text)
                    .intent
            }
            is SharingType.SmsType -> {
                Intent().apply {
                    action = Intent.ACTION_VIEW
                    data = Uri.parse("sms: ${sharingType.sms.phoneNumber}")
                    putExtra("sms_body", sharingType.sms.body)
                }
            }
            is SharingType.WebBrowserType -> {
                Intent().apply {
                    action = Intent.ACTION_VIEW
                    data = sharingType.url.toUri()
                }
            }
        }
    }
}