package greedy

import java.util.*

fun main() {
    val sc: Scanner = Scanner(System.`in`)

    val number: Int = sc.nextInt()
    val times: IntArray = IntArray(number)
    var totalTime = 0
    var tempTime = 0

    for (i in 0 until number) {
        times[i] = sc.nextInt()
    }

    times.sortedArray().map {
        tempTime += it
        totalTime += tempTime
    }

    println(totalTime)
}