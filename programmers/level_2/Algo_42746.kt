package algorithm.programmers.level_2

fun main() {
    fun solution(numbers: IntArray) = run {
        val answer = numbers.sortedWith { first, second ->
            "$second$first".compareTo("$first$second")
        }.joinToString("")

        if (answer.startsWith("0")) "0" else answer
    }

    val result = solution(intArrayOf(3, 30, 34, 5, 9))
    println(result)
}