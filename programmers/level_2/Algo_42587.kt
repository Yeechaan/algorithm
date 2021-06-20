package algorithm.programmers.level_2

import java.util.*

fun main() {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 1
        var addStatus = false
        val printerResult = mutableListOf<Int>()

        val priorityQueue: Queue<Pair<Int, Int>> = LinkedList<Pair<Int, Int>>()
        priorities.mapIndexed { index, priority ->
            priorityQueue.add(Pair(index, priority))
        }

        while (priorityQueue.isNotEmpty()) {
            val currentValue = priorityQueue.poll()
            if (priorityQueue.isEmpty()) printerResult.add(currentValue.first)

            for (it in priorityQueue) {
                if (currentValue.second < it.second) {
                    addStatus = true
                    break
                }

                if (priorityQueue.last().first == it.first) {
                    printerResult.add(currentValue.first)
                }
            }

            if (addStatus) priorityQueue.add(currentValue)
            addStatus = false
        }

        printerResult.forEachIndexed { index, i ->
            if (i == location) {
                answer = index
                return@forEachIndexed
            }
        }

        return answer
    }

//    val result = solution(intArrayOf(2, 1, 3, 2), 2)
    val result = solution(intArrayOf(1, 1, 9, 1, 1, 1), 0)

    println(result)
}