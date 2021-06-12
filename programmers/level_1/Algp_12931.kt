package algorithm.programmers.level_1

fun main() {

    fun solution(n: Int): Int = run {
        n.toString().map { Character.getNumericValue(it) }.sum()
    }

    val result = solution(1234)

    println(result)
}