**Tugas Minggu 5**
**Pemrograman Aplikasi Mobile**

Nama: Fanisa Aulia Safitri
NIM: 123140121
Program Studi: Teknik Informatika
Kelaas: RB

aplikasi ini dikembangkan dengan menggunakan **Kotlin Multiplatform (KMP)** dengan **Jetpack Compose** untuk memenuhi kriteria pada tugas praktikum minggu 5 ini, yaitu implementasi Navigasi Antar Layar (Navigation component) dan Manajemen State

**Fitur Utama**

- Terdapat 3 tab utama dalam navigasi ini yaitu:
1. Notes yang menampilkan daftar catatan sederhana menggunakan LazyColumn
2. Favorites yang menampilkan daftar item favorit dengan UI ListItem
3. Profile yang menampilkan profile mahasiswa meliputi nama, nim dan bio
- Navigasi Detail: Fitur "Edit Profile" digunakan untuk mengubah data profil tanpa kehilangan state saat berpindah tab
- Manajemen State: Menggunakan ViewModel dan StateFlow untuk sinkronisasi data antar layar
- Dark Mode: Fitur switch tema antara dark mode dan light mode yang terintegrasi di seluruh aplikasi
- Responsive UI: diuji menggunakan emulator Pixel 9 Pro Fold untuk memastikan tata letak yang adaptif

**Struktur Proyek**

Proyek ini mengikuti arsitektur yang rapi untuk memudahkan skalabilitas, strukturnya yittu:

composeApp/src/commonMain/kotlin/com/fanisa/profileapp/
├── components/          # Komponen UI reusable (BottomNavigationBar)
├── data/               # Model data dan State (ProfileUiState)
├── navigation/         # Konfigurasi rute (Screen.kt)
├── screens/            # Halaman utama (Notes, Favorites)
├── ui/                 # Halaman profil dan edit (Profile, Edit)
├── viewmodel/          # Logika bisnis (ProfileViewModel)
└── App.kt              # Root Navigation & Scaffold

**Teknologi yang Digunakan**
1. Kotlin Multiplatform
2. Jetpack Compose Multiplatform
3. JetBrains Navigation Library
4. Lifecycle ViewModel Compose
5. Material Design 3

**Cara Menjalankan**
1. Buka proyek di Android Studio
2. Pastikan Graadle Sync berhasil
3. Pilih konfigurasi ComposeApp dan jalankan pada emulator Android

Dokumentasi
Navigasi Notes:
<img width="519" height="529" alt="image" src="https://github.com/user-attachments/assets/5f267857-51df-43f9-8277-47b686229745" />
Navigasi Favorites:
<img width="484" height="529" alt="image" src="https://github.com/user-attachments/assets/2f7fa716-ae50-46dd-9f3c-4078217024fb" />
Navigasi Profile:
<img width="500" height="526" alt="image" src="https://github.com/user-attachments/assets/1034d29e-bd3e-4c07-975f-d142423a6fb2" />


Video Tampilan Fitur:
