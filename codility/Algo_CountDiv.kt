package algorithm.codility

fun main() {
    fun solution(A: Int, B: Int, K: Int): Int {
        if (A == B) {
            return if (A % K == 0) 1
            else 0
        }

        var answer = (B / K) - (A / K)
        if (A % K == 0) answer++

        return answer
    }

    val result = solution(6, 11, 2)
//    val result = solution(0, 0, 11)

    println(result)
}