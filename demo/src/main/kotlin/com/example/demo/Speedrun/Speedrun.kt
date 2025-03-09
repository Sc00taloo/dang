package com.example.demo.Speedrun

import com.example.demo.Category.Category
import jakarta.persistence.*
import java.time.LocalDateTime
import java.util.UUID

@Entity
@Table(name = "speedrun")
class Speedrun(
    @Id
    @Column(name = "id", nullable = false)
    var id: UUID = UUID.randomUUID(),

    @Column(name = "date", nullable = false)
    var date: LocalDateTime,

    @Column(name = "link", length = 128)
    var link: String?,

    @Column(name = "time", nullable = false)
    var time: Long,

    @Column(name = "status", nullable = false, length = 100)
    var status: String,

    @OneToMany(fetch = FetchType.LAZY)
    @Column(name = "author_id", nullable = false)
    var authorId: UUID,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    var category: Category
) {
    constructor() : this(
        id = UUID.randomUUID(),
        date = LocalDateTime.now(),
        link = null,
        time = 0L,
        status = "",
        authorId = UUID.randomUUID(),
        category = Category()
    )
}