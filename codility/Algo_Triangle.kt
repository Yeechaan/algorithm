package algorithm.codility

fun main() {

    fun solution(A: IntArray): Int {
        if (A.size < 3) return 0

        val sortedNumbers = A.sorted()

        for (i in 0 until sortedNumbers.size - 2) {
            val p = sortedNumbers[i].toLong()
            val q = sortedNumbers[i + 1].toLong()
            val r = sortedNumbers[i + 2].toLong()

            if ((p + q) > r && (q + r) > p && (r + p) > q) {
                return 1
            }
        }

        return 0
    }

//    val result = solution(intArrayOf(5, 1, 2, 20, 10, 8))
    val result = solution(intArrayOf(10, 10, 10))
//    val result = solution(intArrayOf(5, 10, 1, 50))
    println(result)
}