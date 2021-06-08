package algorithm.programmers.level_1

fun main() {
    fun solution(n: Long): IntArray = n.toString().reversed().map { it.toShort().toInt() }.toIntArray()


    val result = solution(12345)

    println(result.toList())
}