package algorithm.baekjoon.stack

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val size: Int = readLine()!!.toInt()
    val numberList = arrayOfNulls<Int>(size)

    for (i in 0..numberList.lastIndex) {
        numberList[i] = sc.nextLine()!!.toInt()
    }

    val numberStack = Stack<Int>()

    numberList.forEach {
        if (numberStack.isNotEmpty() && it == 0) {
            numberStack.pop()
        } else {
            numberStack.push(it)
        }
    }

    println(numberStack.sum())
}