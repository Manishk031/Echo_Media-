package com.zoro.echomedia.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.zoro.echomedia.R
import com.zoro.echomedia.navigation.Routes
import kotlinx.coroutines.delay

@Composable
fun Splash(navController: NavHostController){

              ConstraintLayout(modifier = Modifier.fillMaxSize()) {

                 val (image) = createRefs()
                  Image(painter = painterResource(id = R.drawable.logo), contentDescription = "logo",
                      modifier = Modifier.constrainAs(image){
                          top.linkTo(parent.top)
                          bottom.linkTo(parent.bottom)
                          start.linkTo(parent.start)
                          end.linkTo(parent.end)
                      }.size(120.dp))

              }
    LaunchedEffect(true ){
        delay(3000)
        navController.navigate(Routes.BottomNav.routes)


    }
}