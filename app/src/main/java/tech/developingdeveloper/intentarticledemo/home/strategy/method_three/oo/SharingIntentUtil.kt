package tech.developingdeveloper.intentarticledemo.home.strategy.method_three.oo

import android.content.Context
import android.content.Intent

fun shareIntent(context: Context, sharingIntent: SharingIntent) {
    val intent = sharingIntent.prepareIntent()
    val shareIntent = Intent.createChooser(intent, sharingIntent.intentChooserTitle)
    context.startActivity(shareIntent)
}