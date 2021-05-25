package algorithm.codility

fun main() {
    fun solution(X: Int, Y: Int, D: Int): Int {
        var answer = (Y - X) / D

        if ((Y - X) / D != 0) answer++

        return answer
    }

//    val result = solution(10, 85, 30)
    val result = solution(11, 11, 30)

    println(result)
}