package algorithm.programmers.level_2

import java.util.*

fun main() {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 1

        val priorityQueue: Queue<Pair<Int, Int>> = LinkedList<Pair<Int, Int>>()
        priorities.mapIndexed { index, priority ->
            priorityQueue.add(Pair(index, priority))
        }

        while (priorityQueue.isNotEmpty()) {
            val currentValue = priorityQueue.poll()

            if (priorityQueue.any { currentValue.second < it.second }) {
                priorityQueue.add(currentValue)
            } else {
                if (currentValue.first == location) {
                    break
                } else {
                    answer += 1
                }
            }
        }

        return answer
    }

//    val result = solution(intArrayOf(2, 1, 3, 2), 2)
    val result = solution(intArrayOf(1, 1, 9, 1, 1, 1), 0)

    println(result)
}