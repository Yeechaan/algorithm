package algorithm.codility

import java.util.*

fun main() {

    fun solution(S: String): Int {
        val stack = Stack<Char>()

        for (i in S.indices) {
            if (S[i] == '(') {
                stack.push(S[i])
            } else if ((stack.empty() && S[i] == ')') || (!stack.isEmpty() && stack.pop() != '(')){
                return 0
            }

            println(stack.toString())
        }

        return if (stack.isNotEmpty()) 0 else 1
    }

//    val result = solution("(()(())())")
    val result = solution("()(")
    println(result)
}