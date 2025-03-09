package com.example.demo.Category

import com.example.demo.entity.Game
import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "category")
class Category(
    @Id
    @Column(name = "id", nullable = false)
    var id: UUID = UUID.randomUUID(),

    @Column(name = "name", nullable = false, length = 200)
    var name: String,

    @Column(name = "description")
    var description: String?,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "game_id", nullable = false)
    var game: Game
) {
    constructor() : this(
        id = UUID.randomUUID(),
        name = "",
        description = null,
        game = Game()
    )
}