package algorithm.programmers.level_1

fun main() {
    fun solution(s: String): String {
        var answer = ""

        s.split(" ").map {
            for (i in it.indices) {
                answer += if (i % 2 != 0) {
                    if (!it[i].isLowerCase()) it[i] + 32 else it[i]
                } else {
                    if (!it[i].isUpperCase()) it[i] - 32 else it[i]
                }
            }
            answer += " "
        }
        return answer.removeRange(answer.length - 1, answer.length)
    }

    val result = solution("Try Hello World")

    println(result)
}