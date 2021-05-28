package algorithm.programmers.level_1

fun main(args: Array<String>) {

    fun solution(n: Int): Int = n.toString(3).reversed().toInt(3)

//    val result = solution("MSSLS")
//    val result = solution("LLMS")
    val result = solution(125)
//    val result = solution(45)

    println(result)
}