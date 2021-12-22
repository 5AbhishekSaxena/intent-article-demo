package tech.developingdeveloper.intentarticledemo.home.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import tech.developingdeveloper.intentarticledemo.home.strategy.SharingIntent
import tech.developingdeveloper.intentarticledemo.home.strategy.method_three.oo.OOSharingIntent
import tech.developingdeveloper.intentarticledemo.home.strategy.method_three.oo.sms.Sms
import tech.developingdeveloper.intentarticledemo.home.strategy.method_two.sealed.SealedClassesSharingIntent

@Composable
fun HomeScreen() {
    val context = LocalContext.current

    val sharingIntent: SharingIntent = remember {
//        UtilityMethodsSharingIntent() // method 1
//        SealedClassesSharingIntent() // method 2
        OOSharingIntent() // method 3
    }

    HomeContent(
        onSmsButtonClick = {
            val sms = Sms(
                phoneNumber = "9999999999",
                body = "Hey, this is a  test message."
            )
            sharingIntent.onSmsClick(context, sms)
        },
        onSimpleTextButtonClick = {
            val text = "This is some default text."
            sharingIntent.onSimpleTextButtonClick(context, text)
        }, onWebSharingButtonClick = {
            val url = "https://www.google.com"
            sharingIntent.onWebSharingButtonClick(context, url)
        }
    )
}