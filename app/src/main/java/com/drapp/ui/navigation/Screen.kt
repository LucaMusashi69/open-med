package com.drapp.ui.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object Login : Screen("login")
    object Register : Screen("register")
    object Home : Screen("home")
    object DoctorDetail : Screen("doctor_detail/{doctorId}") {
        fun createRoute(doctorId: String) = "doctor_detail/$doctorId"
    }
    object Appointment : Screen("appointment")
    object Profile : Screen("profile")
}