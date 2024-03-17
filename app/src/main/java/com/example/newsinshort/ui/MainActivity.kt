package com.example.newsinshort.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.material3.Surface
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Modifier
import com.example.newsinshort.ui.navigation.AppNavigationGraph
//import com.example.newsinshort.ui.components.AppNavigationGraph
import com.example.newsinshort.ui.theme.NewsInShortTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsInShortTheme {
                Surface(
                    modifier =Modifier.fillMaxSize().background(Color.Blue)
                ){
                    AppEntryPoint()
                }



                }
            }
        }
    }
    @Composable
    fun AppEntryPoint(){
        AppNavigationGraph()
    }



