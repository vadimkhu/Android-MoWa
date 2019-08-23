package com.example.mowa

sealed class Result<out T: Any> {
    data class Success<out T: Any>(val data: T) : Result<T>()
    data class Error<out T: Any>(val exception: Exception): Result<Nothing>()
}