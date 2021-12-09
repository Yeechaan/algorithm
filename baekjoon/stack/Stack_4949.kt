package algorithm.baekjoon.stack

import java.util.*

fun main() {
    val matchedBrackets = mapOf('(' to ')', '[' to ']')

    fun isBracketMatched(first: Char, second: Char) =
        matchedBrackets[first] == second

    val sc = Scanner(System.`in`)
    var sentence = sc.nextLine()

    while (sentence.isNotEmpty()) {
        val bracketStack = Stack<Char>()

        for (item in sentence) {
            when (item) {
                '(', '[' -> bracketStack.push(item)
                ')', ']' -> {
                    if (bracketStack.isNotEmpty()) {
                        val lastBracket = bracketStack.pop()
                        if (!isBracketMatched(lastBracket, item)) {
                            break
                        }
                    }
                }
            }
        }

        if (bracketStack.isEmpty()) println("yes")
        else println("no")

        sentence = sc.nextLine()
    }
}