package algorithm.codility

fun main() {
    fun solution(A: IntArray): Int {
        var answer = 0

        val numbers = hashSetOf<Int>()

        A.map { if (it > 0) numbers.add(it) }

        for (i in 1..numbers.size) {
            if (!numbers.contains(i)) break
            answer++
        }

        return answer + 1
    }

    val result = solution(intArrayOf(1, 3, 6, 4, 1, 2, -1))
//    val result = solution(intArrayOf(-2, -1))
//    val result = solution(intArrayOf(1, 2, 3))
    println(result)
}