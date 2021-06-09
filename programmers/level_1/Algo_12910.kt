package algorithm.programmers.level_1

fun main() {
    fun solution(arr: IntArray, divisor: Int): IntArray = run {
        val answer: IntArray = arr.filter { (it % divisor) == 0 }.sorted().toIntArray()

        if (answer.isEmpty()) {
            intArrayOf(-1)
        } else {
            answer
        }
    }

    val result = solution(intArrayOf(3, 30, 34, 5, 9), 3)

    println(result.toList())
}