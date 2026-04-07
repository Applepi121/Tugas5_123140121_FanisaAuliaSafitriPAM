package com.fanisa.profileapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.NoteAdd
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotesScreen() {
    val dummyNotes = listOf(
        "Belajar Navigation Compose",
        "Mengerjakan Tugas Minggu 5",
        "Review KMP Desktop",
        "Persiapan Kuis Pemrograman Mobile",
        "Beli makan di kantin ITERA"
    )

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("My Notes") })
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /* Aksi Tambah Note */ }) {
                Icon(Icons.Default.NoteAdd, contentDescription = "Add Note")
            }
        }
    ) { padding ->
        if (dummyNotes.isEmpty()) {
            Box(Modifier.fillMaxSize().padding(padding), contentAlignment = Alignment.Center) {
                Text("Belum ada catatan.")
            }
        } else {
            LazyColumn(
                modifier = Modifier.fillMaxSize().padding(padding),
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(dummyNotes) { note ->
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
                    ) {
                        Padding(modifier = Modifier.padding(16.dp)) {
                            Text(text = note, style = MaterialTheme.typography.bodyLarge)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Padding(modifier: Modifier, content: @Composable () -> Unit) {
    Box(modifier) { content() }
}