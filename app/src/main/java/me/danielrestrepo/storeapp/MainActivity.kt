package me.danielrestrepo.storeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import me.danielrestrepo.storeapp.ui.theme.StoreAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StoreAppTheme {

                val myNavController = rememberNavController()
                val myStartDestination: String = "Login"

                NavHost(
                    navController = myNavController,
                    startDestination = myStartDestination,
                ){
                    composable("login"){
                        LoginScreen(myNavController)
                    }
                    composable("register"){
                        RegisterScreen()
                    }
                }
            }
        }
    }
}
