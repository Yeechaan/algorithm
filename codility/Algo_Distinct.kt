package algorithm.codility

fun main() {
    fun solution(A: IntArray): Int {
        return A.toSet().size
    }

    val result = solution(intArrayOf(2,1,1,2,3,1))
    println(result)
}