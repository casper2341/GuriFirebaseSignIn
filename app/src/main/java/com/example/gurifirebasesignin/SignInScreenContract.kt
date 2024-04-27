package com.example.gurifirebasesignin

data class SignInState(
    val isSignInSuccessful: Boolean = false,
    val signInError: String? = null
)