package algorithm.programmers.level_1

fun main() {
    fun solution(n: Int): String {
        var answer = ""

        (0 until n).map {
            answer += if (it % 2 == 0) {
                "수"
            } else {
                "박"
            }
        }

        return answer
    }

    val result = solution(3)

    println(result)
}