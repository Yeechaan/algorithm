package algorithm.codility

fun main() {
    fun solution(A: IntArray): Int {
        var answer = Int.MAX_VALUE
        var sumOfFront = A[0]
        var sumOfEnd = A.sum() - A[0]

        for (i in 1 until A.size) {
            val sumDifference = Math.abs(sumOfFront - sumOfEnd)
            if (answer > sumDifference) answer = sumDifference

            sumOfFront += A[i]
            sumOfEnd -= A[i]
        }

        return answer
    }

    val result = solution(intArrayOf(3, 1, 2, 4, 3))
    println(result)
}
