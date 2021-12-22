package tech.developingdeveloper.intentarticledemo.home.ui

import androidx.lifecycle.ViewModel
import tech.developingdeveloper.intentarticledemo.home.strategy.SharingIntent
import tech.developingdeveloper.intentarticledemo.home.strategy.method_one.UtilityMethodsSharingIntent
import tech.developingdeveloper.intentarticledemo.home.strategy.method_three.oo.OOSharingIntent
import tech.developingdeveloper.intentarticledemo.home.strategy.method_two.sealed.SealedClassesSharingIntent

class HomeViewModel : ViewModel() {

    /**
     * This is a poor implementation of Strategy Design Pattern, this is done so the user can easily
     * test different approaches listed in the article(link) without making a lot of modifications.
     */
    val sharingIntent: SharingIntent =
//        UtilityMethodsSharingIntent() // method 1
//        SealedClassesSharingIntent() // method 2
        OOSharingIntent() // method 3

}