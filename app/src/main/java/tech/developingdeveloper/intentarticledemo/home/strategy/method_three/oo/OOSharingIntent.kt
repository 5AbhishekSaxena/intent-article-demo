package tech.developingdeveloper.intentarticledemo.home.strategy.method_three.oo

import android.content.Context
import tech.developingdeveloper.intentarticledemo.home.strategy.method_three.oo.sms.Sms
import tech.developingdeveloper.intentarticledemo.home.strategy.method_three.oo.sms.SmsSharingIntent
import tech.developingdeveloper.intentarticledemo.home.strategy.SharingIntent

class OOSharingIntent : SharingIntent {

    override fun onSmsClick(context: Context, sms: Sms) {
        shareViaSms(context, sms)
    }

    private fun shareViaSms(context: Context, sms: Sms) {
        val chooserTitle = "Sharing with"
        val smsSharingIntent = SmsSharingIntent(sms, chooserTitle)
        shareIntent(context, smsSharingIntent)
    }

    override fun onSimpleTextButtonClick(context: Context, text: String) {
        shareSimpleText(context, text)
    }

    private fun shareSimpleText(context: Context, text: String) {
        val chooserTitle = "Sharing with"
        val textSharingIntent = DefaultSharingIntent(context, text, chooserTitle)
        shareIntent(context, textSharingIntent)
    }

    override fun onWebSharingButtonClick(context: Context, url: String) {
        openWebPage(context, url)
    }

    private fun openWebPage(context: Context, url: String) {
        val chooserTitle = "Open url using"
        val webBrowserSharingIntent = WebBrowserSharingIntent(url, chooserTitle)
        shareIntent(context, webBrowserSharingIntent)
    }
}