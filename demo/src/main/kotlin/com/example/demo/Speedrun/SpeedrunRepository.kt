package com.example.demo.Speedrun

import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface SpeedrunRepository : JpaRepository<Speedrun, UUID> {
    fun existsByAuthorIdAndCategoryIdAndTime(authorId: UUID, categoryId: UUID, time: Long): Boolean
}