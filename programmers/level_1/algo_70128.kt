package algorithm.programmers.level_1

fun main() {

    fun solution(a: IntArray, b: IntArray): Int {
        var answer: Int = 0

        for (i in a.indices) {
            answer += (a[i] * b[i])
        }

        // kotlin.collections 의 zip extension function 을 이용하는 풀이
//        answer = a.zip(b).map { it.first * it.second }.sum()
//        answer = a.zip(b).sumOf { it.first * it.second }
//        answer = a.zip(b) { first, second ->
//            first * second
//        }.sum()

        return answer
    }

    val result = solution(intArrayOf(1, 2, 3, 4), intArrayOf(-3,-1,0,2))
    println(result)
}