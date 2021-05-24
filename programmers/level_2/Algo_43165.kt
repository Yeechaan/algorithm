package algorithm.programmers.level_2

import java.util.*

fun main(args: Array<String>) {

    // BFS
//    fun solution(numbers: IntArray, target: Int): Int {
//        var answer = 0
//
//        val queue: Queue<Pair<Int, Int>> = LinkedList()
//        queue.offer(Pair(numbers[0], 0))
//        queue.offer(Pair(-numbers[0], 0))
//
//        // 큐가 빌 때까지 반복
//        while (queue.isNotEmpty()) {
//            // 큐에서 하나의 원소 뽑아 출력
//            val item = queue.poll()
//
//            if (item.second == numbers.size - 1) {
//                if (item.first == target) answer++
//                continue
//            }
//
//            val positiveSum = item.first + numbers[item.second + 1]
//            val negativeSum = item.first - numbers[item.second + 1]
//
//            queue.offer(Pair(positiveSum, item.second + 1))
//            queue.offer(Pair(negativeSum, item.second + 1))
//        }
//
//        return answer
//    }

    // DFS
    fun solution(numbers: IntArray, target: Int): Int {
        var answer = 0
        fun dfs(sum: Int, idx: Int) {
            if (idx < numbers.size - 1) {
                dfs(sum + numbers[idx], idx + 1)
                dfs(sum - numbers[idx], idx + 1)
            } else {
                if (sum + numbers[idx] == target) {
                    answer++
                }
                if (sum - numbers[idx] == target) {
                    answer++
                }
            }
        }
        dfs(0, 0)
        return answer
    }

    val result = solution(intArrayOf(1, 1, 1, 1, 1), 3)

    println(result)
}