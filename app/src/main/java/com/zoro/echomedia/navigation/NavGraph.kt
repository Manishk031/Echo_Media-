package com.zoro.echomedia.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.zoro.echomedia.screens.AddThreads
import com.zoro.echomedia.screens.BottomNav
import com.zoro.echomedia.screens.Home
import com.zoro.echomedia.screens.Notification
import com.zoro.echomedia.screens.Search
import com.zoro.echomedia.screens.Splash
import com.zoro.echomedia.screens.profile

@Composable
fun NavGraph(navController: NavHostController){
        // user can select routes and they can compaire other routes and final result is open user selected rotues.
    // when i was calling a routes so then can compaire otherr routes and final result is open routes to user select.
    NavHost(navController = navController,startDestination = Routes.Splash.routes){


        composable(Routes.Splash.routes){
            Splash(navController)
        }
        composable(Routes.Home.routes){
              Home()

        }
        composable(Routes.Search.routes){
            Search()

        }
        composable(Routes.Notification.routes){
            Notification()

        }
        composable(Routes.AddThreads.routes){
            AddThreads()

        }
        composable(Routes.profile.routes){
            profile()

        }
        composable(Routes.BottomNav.routes){
            BottomNav(navController)

        }

    }
}


