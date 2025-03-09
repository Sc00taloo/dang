package com.example.demo.Speedrun

import java.time.LocalDateTime
import java.util.UUID

data class SpeedrunRequestDTO(
    val date: LocalDateTime,
    val link: String?,
    val time: Long,
    val status: String,
    val authorId: UUID,
    val categoryId: UUID
)