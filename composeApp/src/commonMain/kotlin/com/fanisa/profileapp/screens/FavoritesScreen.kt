package com.fanisa.profileapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FavoritesScreen() {
    val favoriteItems = listOf("Kotlin Multiplatform", "Jetpack Compose", "Material Design 3")

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Favorites") })
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = null,
                modifier = Modifier.size(64.dp),
                tint = Color.Red
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                "Materi Favorit Semester 6",
                style = MaterialTheme.typography.titleMedium
            )
            Spacer(modifier = Modifier.height(24.dp))

            favoriteItems.forEach { item ->
                ListItem(
                    headlineContent = { Text(item) },
                    leadingContent = {
                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = null,
                            tint = Color(0xFFFFC0CB)
                        )
                    },
                    colors = ListItemDefaults.colors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                    modifier = Modifier.padding(vertical = 4.dp)
                )
            }
        }
    }
}