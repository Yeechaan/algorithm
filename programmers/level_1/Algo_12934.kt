package algorithm.programmers.level_1

import kotlin.math.sqrt


fun main() {
    fun solution(n: Long): Long {
        val a = sqrt(n.toDouble()).toLong()
        return if (a * a == n) (a + 1)*(a + 1) else -1
    }

    val result = solution(121)
    println(result)
}
