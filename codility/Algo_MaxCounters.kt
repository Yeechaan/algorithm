package algorithm.codility

fun main() {
    fun solution(N: Int, A: IntArray): IntArray {
        val answer = IntArray(N)
        var maxCounter = 0
        var baseCounter = 0

        A.map {
            val item = it - 1

            if (item in (0 until N)) {
                if (answer[item] >= baseCounter) {
                    answer[item]++
                } else {
                    answer[item] = baseCounter + 1
                }
                if (answer[item] > maxCounter) maxCounter = answer[item]
            } else {
                baseCounter = maxCounter
            }
        }

        (0 until N).forEach { if (answer[it] < baseCounter) answer[it] = baseCounter }

        return answer
    }

    val result = solution(5, intArrayOf(3, 4, 4, 6, 1, 4, 4))
    println(result.toList().toString())
}†