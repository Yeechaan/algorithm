package algorithm.programmers.level_2

import java.util.*

fun main() {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var answer = 0
        val bridgeQueue: Queue<Int> = LinkedList()
        val truckQueue: Queue<Int> = LinkedList()

        (0 until bridge_length).map { bridgeQueue.offer(0) }
        truck_weights.map { truckQueue.offer(it) }

        while (bridgeQueue.isNotEmpty()) {
            answer++
            bridgeQueue.poll()

            if (truckQueue.isNotEmpty()) {
                if (weight - bridgeQueue.sum() >= truckQueue.peek()) {
                    bridgeQueue.offer(truckQueue.poll())
                } else {
                    bridgeQueue.offer(0)
                }
            }
        }

        return answer
    }

//    val result = solution(2, 10, intArrayOf(7, 4, 5, 6))
    val result = solution(100, 100, intArrayOf(10,10,10,10,10,10,10,10,10,10))

    println(result)
}