package com.drapp.ui.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.drapp.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    onNavigateToLogin: () -> Unit,
    onNavigateToHome: () -> Unit
) {
    // En una aplicación real, verificaríamos si el usuario ya está autenticado
    // y navegaríamos a la pantalla correspondiente
    
    LaunchedEffect(key1 = true) {
        delay(2000) // Esperar 2 segundos
        onNavigateToLogin() // Por ahora, siempre navegamos a login
    }
    
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.primary),
        contentAlignment = Alignment.Center
    ) {
        // En una aplicación real, aquí cargaríamos el logo desde los recursos
        Text(
            text = "Doctor App",
            color = MaterialTheme.colors.onPrimary,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
    }
}