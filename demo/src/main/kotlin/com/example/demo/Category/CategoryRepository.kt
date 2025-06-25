//package com.example.demo.repository
//
//import com.example.demo.Category.Category
//import org.springframework.data.jpa.repository.JpaRepository
//import java.util.UUID
//
//interface CategoryRepository : JpaRepository<Category, UUID> {
//    fun existsByNameAndGameId(name: String, gameId: UUID): Boolean
//}