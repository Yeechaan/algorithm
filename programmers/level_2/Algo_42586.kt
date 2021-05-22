package algorithm.programmers.level_2

import java.util.*
import kotlin.math.ceil

fun main(args: Array<String>) {

    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        val progressRemainDays: Queue<Int> = LinkedList()

        progresses.mapIndexed { index, progress ->
            progressRemainDays.add(ceil((100 - progress).toFloat() / speeds[index].toFloat()).toInt())
        }

        while (progressRemainDays.isNotEmpty()) {
            var numberOfRelease = 1
            val progressRemainDay = progressRemainDays.poll()

            while (progressRemainDays.isNotEmpty() && progressRemainDays.peek() <= progressRemainDay) {
                numberOfRelease++
                progressRemainDays.poll()
            }
            answer.add(numberOfRelease)
        }

        return answer.toIntArray()
    }


//    val result = solution(intArrayOf(93, 30, 55), intArrayOf(1, 30, 5))
    val result = solution(intArrayOf(95, 90, 99, 99, 80, 99), intArrayOf(1, 1, 1, 1, 1, 1))
//    val result = solution(intArrayOf(70), intArrayOf(20))

    println(result.toList())
}