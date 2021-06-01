package algorithm.programmers.level_1

fun main() {
    fun solution(x: Int, n: Int): LongArray = LongArray(n) { index -> x.toLong() * (index + 1) }

//    val result = solution(2, 5)
    val result = solution(-4, 2)

    println(result.toList().toString())
}

