package tech.developingdeveloper.intentarticledemo.home.strategy.method_two.sealed

import android.content.Context
import android.content.Intent
import tech.developingdeveloper.intentarticledemo.home.strategy.method_three.oo.sms.Sms
import tech.developingdeveloper.intentarticledemo.home.strategy.SharingIntent

class SealedClassesSharingIntent : SharingIntent {

    private val sharingIntentFactory = SharingIntentFactory()

    override fun onSmsClick(context: Context, sms: Sms) {
        shareViaSms(context, sms)
    }

    private fun shareViaSms(context: Context, sms: Sms) {
        val sharingType = SharingType.SmsType(sms)
        val intent = sharingIntentFactory.prepareIntent(context, sharingType)
        startActivity(context, intent, "Sharing with")
    }

    override fun onSimpleTextButtonClick(context: Context, text: String) {
        shareSimpleText(context, text)
    }

    private fun shareSimpleText(context: Context, text: String) {
        val sharingType = SharingType.Default(text)
        val intent = sharingIntentFactory.prepareIntent(context, sharingType)
        startActivity(context, intent, "Sharing with")
    }

    override fun onWebSharingButtonClick(context: Context, url: String) {
        openWebPage(context, url)
    }

    private fun openWebPage(context: Context, url: String) {
        val sharingType = SharingType.WebBrowserType(url)
        val intent = sharingIntentFactory.prepareIntent(context, sharingType)
        startActivity(context, intent, "Open url using")
    }

    private fun startActivity(context: Context, intent: Intent, chooserTitle: String) {
        val intentWithChooser = Intent.createChooser(intent, chooserTitle)
        context.startActivity(intentWithChooser)
    }
}