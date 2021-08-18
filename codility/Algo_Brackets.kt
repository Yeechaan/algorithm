package algorithm.codility

import java.util.*

fun main() {
    fun solution(S: String): Int {
        var answer = 1
        val stack = Stack<Char>()

        val openBrackets = arrayOf('{', '[', '(')
        val brackets = mapOf('{' to '}', '[' to ']', '(' to ')')

        S.forEach {
            if (openBrackets.contains(it)) {
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

        if (stack.isNotEmpty()) answer = 0

        return answer
    }

//    val result = solution("}")
//    val result = solution("([)()]")
    val result = solution("{[()()]}")
    println(result)
}