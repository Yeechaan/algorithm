package algorithm.programmers.level_1

fun main() {
    fun solution(s: String): Int = run {
        if (s[0] == '-') {
            s.substring(1).toInt().unaryMinus()
        } else {
            s.toInt()
        }
    }

//    val result = solution("-1234")
    val result = solution("1234")

    println(result)
}