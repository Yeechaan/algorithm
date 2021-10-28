package algorithm.baekjoon.stack

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val size: Int = readLine()!!.toInt()
    val inputList = arrayOfNulls<String>(size)

    for (i in 0..inputList.lastIndex) {
        inputList[i] = sc.nextLine()
    }

    inputList.forEach {
        val charStack = Stack<Char>()

        it!!.forEach lit@ { char ->
            when (char) {
                '(' -> charStack.push(char)
                ')' -> {
                    if (charStack.isNotEmpty()) {
                        charStack.pop()
                    } else {
                        charStack.push(char)
                        return@lit
                    }
                }
            }
        }

        if (charStack.isEmpty()) println("YES")
        else println("NO")

        charStack.clear()
    }
}