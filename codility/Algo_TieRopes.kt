package algorithm.codility

fun main() {
    fun solution(K: Int, A: IntArray): Int {
        var answer = 0
        var sum = 0

        for (i in A.indices) {
            sum += A[i]

            if (sum >= K) {
                answer++
                sum = 0
            }
        }

        return answer
    }

    val result = solution(4, intArrayOf(1, 2, 3, 4, 1, 1, 3))
    println(result)
}