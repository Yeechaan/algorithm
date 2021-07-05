package algorithm.programmers.codingtest

fun main() {
    fun solution(sizes: Array<IntArray>): Int {
        var horizonMax = 0
        var verticalMax = 0

        sizes.mapIndexed { index, ints ->
            if (ints[0] < ints[1]) {
                sizes[index] = intArrayOf(ints[1], ints[0])
            }
        }

        sizes.map {
            if (it[0] > horizonMax) horizonMax = it[0]
            if (it[1] > verticalMax) verticalMax = it[1]
        }

        return horizonMax * verticalMax
    }

    val result = solution(arrayOf(intArrayOf(60, 50), intArrayOf(30, 70), intArrayOf(60, 30), intArrayOf(80, 40)))
    println(result)
}