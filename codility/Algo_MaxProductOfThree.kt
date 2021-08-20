package algorithm.codility

fun main() {
fun solution(A: IntArray): Int {
    val sortedItems = A.sorted()
    val answer1 = sortedItems[0] * sortedItems[1] * sortedItems[A.size - 1]
    val answer2 = sortedItems[A.size - 1] * sortedItems[A.size - 2] * sortedItems[A.size - 3]

    return when {
        (answer1 > answer2) -> answer1
        (answer1 < answer2) -> answer2
        else -> answer2
    }
}

    val result = solution(intArrayOf(-3, 1, 2, -2, 5, 6))
    println(result)
}