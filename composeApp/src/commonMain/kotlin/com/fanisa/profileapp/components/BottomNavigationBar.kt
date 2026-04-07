package com.fanisa.profileapp.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.fanisa.profileapp.navigation.Screen

@Composable
fun BottomNavigationBar(navController: NavController) {
    val items = listOf(Screen.Notes, Screen.Favorites, Screen.Profile)
    NavigationBar {
        val navBackStackEntry = navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry.value?.destination?.route

        items.forEach { screen ->
            NavigationBarItem(
                icon = { Icon(screen.icon!!, contentDescription = screen.title) },
                label = { Text(screen.title!!) },
                selected = currentRoute == screen.route,
                onClick = {
                    navController.navigate(screen.route) {
                        popUpTo(navController.graph.startDestinationId) { saveState = true }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}