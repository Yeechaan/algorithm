package algorithm.codility

fun main() {
    fun solution(A: IntArray): Int {
        var answer = 0

        val numberSet = (1..A.size).toMutableSet()
        A.map {
            numberSet.remove(it)
        }

        if (numberSet.size == 0) answer = 1

        return answer
    }

    val result = solution(intArrayOf(1, 2, 4, 3))
    println(result)

}