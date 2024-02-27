package com.zoro.echomedia.navigation

sealed class Routes(val routes: String) {

    data object Home : Routes("Home")
    data object AddThreads: Routes("AddThreads")
    data object profile : Routes("profile")
    data object Notification : Routes("Notification")
    data object Splash : Routes("Splash")
    data object Search : Routes("Search")

    data object BottomNav : Routes("BottomNav")


}
