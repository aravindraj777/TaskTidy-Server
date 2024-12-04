package com.buildlive.todoKotlinBack.dto

import java.time.LocalDateTime

data class TodoDTO(
    val title: String,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val isCompleted: Boolean
)
