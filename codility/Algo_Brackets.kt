package algorithm.codility

import java.util.*

fun main() {
    fun solution(S: String): Int {
        val stack = Stack<Char>()
        val brackets = mapOf('{' to '}', '[' to ']', '(' to ')')

        S.forEach {
            if (brackets.keys.contains(it)) {
                stack.push(it)
            } else {
                if (stack.isEmpty()) return 0

                if (it == brackets[stack.peek()]) {
                    stack.pop()
                } else {
                    return 0
                }
            }
        }

        return if (stack.isNotEmpty()) 0 else 1
    }

//    val result = solution("}")
//    val result = solution("([)()]")
    val result = solution("{[()()]}")
    println(result)
}