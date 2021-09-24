package algorithm.leetcode.greedy

fun main() {
    fun maximumUnits(boxTypes: Array<IntArray>, truckSize: Int): Int {
        var answer = 0
        var size = truckSize
        val sortedBoxTypes = boxTypes.sortedByDescending { it[1] }

        for (item in sortedBoxTypes) {
            if (size - item[0] > 0) {
                answer += (item[0] * item[1])
                size -= item[0]
            } else {
                answer += (size * item[1])
                break
            }
        }

        return answer
    }

    val result = maximumUnits(
        arrayOf(
            intArrayOf(1, 3),
            intArrayOf(2, 2),
            intArrayOf(3, 1)
        ), 4
    )
    println(result)
}