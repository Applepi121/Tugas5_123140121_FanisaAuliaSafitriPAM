package com.fanisa.profileapp.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route: String, val title: String? = null, val icon: ImageVector? = null) {
    object Notes : Screen("notes", "Notes", Icons.Default.List)
    object Favorites : Screen("favorites", "Favorites", Icons.Default.Favorite)
    object Profile : Screen("profile", "Profile", Icons.Default.Person)
    object EditProfile : Screen("edit_profile")
}