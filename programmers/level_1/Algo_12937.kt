package algorithm.programmers.level_1

fun main() {
    fun solution(num: Int) = if (num % 2 == 0) "Even" else "Odd"

    val result = solution(3)

    println(result)
}