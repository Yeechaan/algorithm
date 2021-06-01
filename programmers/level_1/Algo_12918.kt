package algorithm.programmers.level_1

fun main() {
    fun solution(s: String): Boolean {
        var answer = false

        if (s.length == 4 || s.length == 6) {
            val countOfWithoutNumber = s.replace("[0-9]".toRegex(), "").length
            if (countOfWithoutNumber == 0) {
                answer = true
            }
        }

        return answer
    }

    val result = solution("12333a5")

    println(result)
}