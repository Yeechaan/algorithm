package algorithm.programmers.level_1

fun main() {
    fun solution(n: Long): IntArray {
        val answer = IntArray(n.toString().length)

        n.toString().toMutableList().reversed().mapIndexed { index, c ->
            answer[index] = c.toInt() - 48
        }

        return answer
    }


    val result = solution(12345)

    println(result.toList())
}