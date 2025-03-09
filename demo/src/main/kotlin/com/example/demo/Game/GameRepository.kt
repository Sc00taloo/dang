package com.example.demo.repository

import com.example.demo.entity.Game
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface GameRepository : JpaRepository<Game, UUID> {
    fun existsByName(name: String): Boolean
}