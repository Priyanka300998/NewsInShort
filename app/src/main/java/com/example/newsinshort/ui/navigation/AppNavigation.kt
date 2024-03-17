package com.example.newsinshort.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.newsinshort.ui.HomeScreen

//class AppNavigation {
    @Composable
    fun AppNavigationGraph(){
        val navController = rememberNavController()
       NavHost(navController = navController, startDestination = Routes.Home_Screen){
           composable(Routes.Home_Screen){
                   HomeScreen()
           }
       }
    }
//}