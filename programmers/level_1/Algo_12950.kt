package algorithm.programmers.level_1

fun main() {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val row = arr1.size
        val column = arr1[0].size

        val answer: Array<IntArray> = Array(row) { IntArray(column) }

        for (i in 0 until row) {
            for (j in 0 until column) {
                answer[i][j] = arr1[i][j] + arr2[i][j]
            }
        }

        return answer
    }

    val result = solution(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3)), arrayOf(intArrayOf(3, 4), intArrayOf(5, 6)))

    println(result)
}