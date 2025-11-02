package com.drapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class DoctorApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Inicialización de componentes globales
    }
}