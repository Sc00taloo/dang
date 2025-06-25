//package com.example.demo.controller
//
//import com.example.demo.Category.Category
//import com.example.demo.Category.CategoryRequestDTO
//import com.example.demo.service.CategoryService
//import com.example.demo.service.GameService
//import org.springframework.http.ResponseEntity
//import org.springframework.web.bind.annotation.*
//import java.util.UUID
//
//@RestController
//@RequestMapping("/api/categories")
//class CategoryController(
//    private val categoryService: CategoryService,
//    private val gameService: GameService
//) {
//    @GetMapping
//    fun getAllCategories(): ResponseEntity<List<Category>> {
//        val categories = categoryService.getAllCategories()
//        return ResponseEntity.ok(categories)
//    }
//
//    @GetMapping("/{id}")
//    fun getCategoryById(@PathVariable id: UUID): ResponseEntity<Category> {
//        val category = categoryService.getCategoryById(id)
//        return if (category != null) {
//            ResponseEntity.ok(category)
//        } else {
//            ResponseEntity.notFound().build()
//        }
//    }
//
//    @PostMapping
//    fun createCategory(@RequestBody request: CategoryRequestDTO): ResponseEntity<Category> {
//        val game = gameService.getGameById(request.gameId)
//            ?: throw IllegalArgumentException("Game with ID ${request.gameId} not found")
//        val category = Category(
//            name = request.name,
//            description = request.description,
//            game = game
//        )
//        val createdCategory = categoryService.createCategory(category)
//        return ResponseEntity.status(201).body(createdCategory)
//    }
//
//    @PutMapping("/{id}")
//    fun updateCategory(@PathVariable id: UUID, @RequestBody request: CategoryRequestDTO): ResponseEntity<Category> {
//        val game = gameService.getGameById(request.gameId)
//            ?: throw IllegalArgumentException("Game with ID ${request.gameId} not found")
//        val updatedCategory = Category(
//            id = id,
//            name = request.name,
//            description = request.description,
//            game = game
//        )
//        val category = categoryService.updateCategory(id, updatedCategory)
//        return ResponseEntity.ok(category)
//    }
//
//    @DeleteMapping("/{id}")
//    fun deleteCategory(@PathVariable id: UUID): ResponseEntity<Void> {
//        categoryService.deleteCategory(id)
//        return ResponseEntity.noContent().build()
//    }
//}