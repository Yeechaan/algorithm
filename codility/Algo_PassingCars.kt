package algorithm.codility

fun main() {
    fun solution(A: IntArray): Int {
        var answer = 0
        var sum = 0

        for (i in A.indices) {
            if (A[i] == 0) {
                sum++
            } else {
                answer += sum
            }

            if (answer > 1000000000) {
                answer = -1
                break
            }
        }

        return answer
    }

    val result = solution(intArrayOf(0,1,0,1,1))
//    val result = solution(intArrayOf(0, 1, 0, 1, 1, 0, 1, 0, 1, 1))

    println(result)
}