package algorithm.programmers.level_1

fun main() {
    fun solution(n: Long): Long = run {
        n.toString().toMutableList().sortedDescending().joinToString("").toLong()
    }

    val result = solution(118372)

    println(result)
}