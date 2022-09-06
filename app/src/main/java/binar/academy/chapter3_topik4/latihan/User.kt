package binar.academy.chapter3_topik4.latihan

import java.io.Serializable

data class User(
    val username : String,
    val password : String,
    val umur : Int = 0
) : Serializable
