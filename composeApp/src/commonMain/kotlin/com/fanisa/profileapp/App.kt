package com.fanisa.profileapp

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.*
import androidx.lifecycle.viewmodel.compose.viewModel
import com.fanisa.profileapp.navigation.Screen
import com.fanisa.profileapp.screens.NotesScreen
import com.fanisa.profileapp.screens.FavoritesScreen
import com.fanisa.profileapp.ui.ProfileScreen
import com.fanisa.profileapp.ui.EditProfileScreen
import com.fanisa.profileapp.components.BottomNavigationBar
import com.fanisa.profileapp.viewmodel.ProfileViewModel

@Composable
fun App() {
    val viewModel: ProfileViewModel = viewModel { ProfileViewModel() }
    val uiState by viewModel.uiState.collectAsState()
    val navController = rememberNavController()

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    MaterialTheme(colorScheme = if (uiState.isDarkMode) darkColorScheme() else lightColorScheme()) {
        Scaffold(
            bottomBar = {
                // BottomBar hanya muncul di 3 Tab Utama
                if (currentRoute == Screen.Notes.route ||
                    currentRoute == Screen.Favorites.route ||
                    currentRoute == Screen.Profile.route) {
                    BottomNavigationBar(navController)
                }
            }
        ) { innerPadding ->
            NavHost(
                navController = navController,
                startDestination = Screen.Notes.route,
                modifier = Modifier.padding(innerPadding)
            ) {
                composable(Screen.Notes.route) {
                    NotesScreen()
                }
                composable(Screen.Favorites.route) {
                    FavoritesScreen()
                }
                composable(Screen.Profile.route) {
                    ProfileScreen(
                        uiState = uiState,
                        onNavigateToEdit = { navController.navigate(Screen.EditProfile.route) },
                        onToggleDark = { enabled -> viewModel.toggleDarkMode(enabled) }
                    )
                }
                composable(Screen.EditProfile.route) {
                    EditProfileScreen(
                        uiState = uiState,
                        onNameChange = { newName -> viewModel.updateName(newName) },
                        onBioChange = { newBio -> viewModel.updateBio(newBio) },
                        onBack = { navController.popBackStack() }
                    )
                }
            }
        }
    }
}