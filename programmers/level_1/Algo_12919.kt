package algorithm.programmers.level_1

fun main() {
    fun solution(seoul: Array<String>): String = "김서방은 ${seoul.indexOf("Kim")}에 있다"

    val result = solution(arrayOf("Jane", "Kim"))

    println(result)
}