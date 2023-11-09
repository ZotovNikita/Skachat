package com.example.dota2.ui.theme

import com.example.dota2.R


data class CommentUi(
    val message: String,
    val user: User,
    val date: String
)


data class User(
    val name: String,
    val avatar: Int
)


val comments = listOf(
    CommentUi(
        message = "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.",
        user = User(
            name = "Auguste Conte",
            avatar = R.drawable.photo1
        ),
        date = "February 14, 2019",
    ), CommentUi(
        message = "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.",
        user = User(
            name = "Jang Marcelino",
            avatar = R.drawable.photo2
        ),
        date = "February 14, 2019",
    )
)
