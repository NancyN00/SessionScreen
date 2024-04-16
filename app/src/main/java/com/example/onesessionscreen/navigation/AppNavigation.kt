package com.example.onesessionscreen.navigation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.onesessionscreen.screens.GroupScreen
import com.example.onesessionscreen.screens.HomeScreen
import com.example.onesessionscreen.screens.OneOneSessionsScreen
import com.example.onesessionscreen.screens.SearchScreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "SuspiciousIndentation")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavigation() {
    val navController: NavHostController = rememberNavController()
    val selected = remember {
        mutableStateOf(Icons.Default.Home)
    }


        Scaffold(
            bottomBar = {
                NavigationBar (  containerColor = MaterialTheme.colorScheme.onPrimary) {
                    val navBackStackEntry by navController.currentBackStackEntryAsState()
                    val currentDestination = navBackStackEntry?.destination

                    listOfItems.forEach { bottomNavItems ->
                        NavigationBarItem(
                            selected = currentDestination?.hierarchy?.any { it.route == bottomNavItems.route } == true,
                            onClick = {
                                navController.navigate(bottomNavItems.route) {
                                    popUpTo(navController.graph.findStartDestination().id) {
                                        saveState = true
                                    }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            },
                            icon = {
                                Icon(
                                    imageVector = bottomNavItems.icon,
                                    contentDescription = null
                                )

                            },
                            label = {
                                Text(text = bottomNavItems.label)

                            }
                        )

                    }

                }
            }

        ) { paddingValues ->
            NavHost(
                navController = navController,
                startDestination = Screens.HomeScreen.name
            ) {
                composable(route = Screens.HomeScreen.name) {
                    HomeScreen()
                }
                composable(route = Screens.OneOneSession.name) {
                    OneOneSessionsScreen()
                }
                composable(route = Screens.SearchScreen.name) {
                    SearchScreen()
                }
                composable(route = Screens.GroupScreen.name) {
                    GroupScreen()
                }
            }

        }

    }
