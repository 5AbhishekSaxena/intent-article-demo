package tech.developingdeveloper.intentarticledemo.home.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import tech.developingdeveloper.intentarticledemo.home.strategy.method_three.oo.sms.Sms

/**
 * This is a poor implementation of Strategy Design Pattern in [homeViewModel] for toastStrategy, this is done so the user can easily
 * test different approaches listed in the article(link) without making a lot of modifications.
 */
@Composable
fun HomeScreen(
    homeViewModel: HomeViewModel
) {
    val context = LocalContext.current
    HomeContent(
        onSmsButtonClick = {
            val sms = Sms(
                phoneNumber = "9999999999",
                body = "Hey, this is a  test message."
            )
            homeViewModel.sharingIntent.onSmsClick(context, sms)
        },
        onSimpleTextButtonClick = {
            val text = "This is some default text."
            homeViewModel.sharingIntent.onSimpleTextButtonClick(context, text)
        }, onWebSharingButtonClick = {
            val url = "https://www.google.com"
            homeViewModel.sharingIntent.onWebSharingButtonClick(context, url)
        }
    )
}