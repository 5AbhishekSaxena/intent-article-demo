package tech.developingdeveloper.intentarticledemo.home.strategy.method_one

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.core.app.ShareCompat
import androidx.core.net.toUri
import tech.developingdeveloper.intentarticledemo.home.strategy.SharingIntent
import tech.developingdeveloper.intentarticledemo.home.strategy.method_three.oo.sms.Sms

class UtilityMethodsSharingIntent : SharingIntent {
    override fun onSmsClick(context: Context, sms: Sms) {
        shareViaSms(context, sms)
    }

    private fun shareViaSms(context: Context, sms: Sms) {
        val intent = Intent().apply {
            action = Intent.ACTION_VIEW
            data = Uri.parse("sms: ${sms.phoneNumber}")
            putExtra("sms_body", sms.body)
        }

        val intentWithChooser = Intent.createChooser(intent, "Sharing with")
        context.startActivity(intentWithChooser)
    }

    override fun onSimpleTextButtonClick(context: Context, text: String) {
        shareSimpleText(context, text)
    }

    private fun shareSimpleText(context: Context, text: String) {
        val intent = ShareCompat.IntentBuilder(context)
            .setType("text/plain")
            .setText(text)
            .intent

        val intentWithChooser = Intent.createChooser(intent, "Sharing with")
        context.startActivity(intentWithChooser)
    }

    override fun onWebSharingButtonClick(context: Context, url: String) {
        openWebPage(context, url)
    }

    private fun openWebPage(context: Context, url: String) {
        val intent = Intent().apply {
            action = Intent.ACTION_VIEW
            data = url.toUri()
        }

        val intentWithChooser = Intent.createChooser(intent, "Open url using")
        context.startActivity(intentWithChooser)
    }
}