package com.example.rockpaperscissor

fun main(){
    var ComputerChoice = " "
    var PlayerChoice = " "

    println("Please Enter your input: ")
    PlayerChoice = readln()

    var RandomNumber = (1..3).random()

    when (RandomNumber) {
        1 -> {
            ComputerChoice = "Rock"
        }
        2 -> {
            ComputerChoice = "Paper"
        }
        3 -> {
            ComputerChoice = "Scissors"
        }
    }

    println(ComputerChoice)

    val winner = when {
        PlayerChoice == ComputerChoice -> "Tie"
        PlayerChoice == "Rock" && ComputerChoice == "Scissors" -> "Player"
        PlayerChoice == "Paper" && ComputerChoice == "Rock" -> "Player"
        PlayerChoice == "Scissor" && ComputerChoice == "Paper" -> "PLayer"
        else -> "Computer"
    }

    println(winner)
}

