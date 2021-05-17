package algorithm.programmers.level_1

import java.util.*

fun main(args: Array<String>) {

    val bucket = Stack<Int>()

    fun checkBucketMatch(doll: Int): Boolean = run {
        if (bucket.isNotEmpty() && bucket.peek() == doll) {
            bucket.pop()
            true
        } else {
            bucket.add(doll)
            false
        }
    }

    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        val size = board.size

        moves.map { move ->
            for (i in 0 until size) {
                val doll = board[i][move - 1]

                if (doll != 0) {
                    if (checkBucketMatch(doll)) {
                        answer += 2
                    }
                    board[i][move - 1] = 0
                    break
                }
            }
        }

        return answer
    }

    val result = solution(arrayOf(intArrayOf(0,0,0,0,0), intArrayOf(0,0,1,0,3), intArrayOf(0,2,5,0,1), intArrayOf(4,2,4,4,2), intArrayOf(3,5,1,3,1)), intArrayOf(1,5,3,5,1,2,1,4))

    println(result)
}