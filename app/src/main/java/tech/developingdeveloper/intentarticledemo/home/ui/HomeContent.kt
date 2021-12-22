package tech.developingdeveloper.intentarticledemo.home.ui

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tech.developingdeveloper.intentarticledemo.core.theme.IntentArticleDemoTheme
import tech.developingdeveloper.intentarticledemo.core.ui.components.PrimaryButton

@Composable
fun HomeContent(
    onSmsButtonClick: () -> Unit,
    onSimpleTextButtonClick: () -> Unit,
    onWebSharingButtonClick: () -> Unit
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        DefaultIntentButton(
            onClick = onSimpleTextButtonClick
        )

        Spacer(modifier = Modifier.height(16.dp))

        SmsIntentButton(
            onClick = onSmsButtonClick
        )

        Spacer(modifier = Modifier.height(16.dp))

        WebBrowserSharingButton(
            onClick = onWebSharingButtonClick
        )
    }
}

@Composable
private fun SmsIntentButton(
    onClick: () -> Unit
) {
    PrimaryButton(
        text = "Sms",
        modifier = Modifier
            .fillMaxWidth(0.6f),
        onClick = onClick
    )
}

@Composable
fun DefaultIntentButton(onClick: () -> Unit) {
    PrimaryButton(
        text = "Simple Text",
        modifier = Modifier
            .fillMaxWidth(0.6f),
        onClick = onClick
    )
}

@Composable
fun WebBrowserSharingButton(onClick: () -> Unit) {
    PrimaryButton(
        text = "Web Browser Sharing",
        modifier = Modifier
            .fillMaxWidth(0.6f),
        onClick = onClick
    )

}

@Preview(
    name = "Night Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Preview(
    name = "Day Mode",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)
@Composable
@Suppress("UnusedPrivateMember")
private fun HomeContentPreview() {
    IntentArticleDemoTheme {
        Surface {
            HomeContent(
                onSmsButtonClick = {},
                onSimpleTextButtonClick = {},
                onWebSharingButtonClick = {}
            )
        }
    }
}