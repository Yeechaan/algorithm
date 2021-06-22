package algorithm.programmers.level_2

import java.util.*

fun main() {
    fun solution(number: String, k: Int): String {
        var count = 0
        val numberStack = Stack<Char>()

        number.forEach {
            while (numberStack.isNotEmpty() && numberStack.peek() < it && count < k) {
                numberStack.pop()
                count++
            }
            numberStack.push(it)
        }

        for (i in count until k) numberStack.pop()

        return numberStack.joinToString("")
    }

//    val result = solution("1924", 2)
//    val result = solution("1231234", 3)
    val result = solution("4177252841", 4)

    println(result)
}†