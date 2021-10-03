package algorithm.easy

fun main() {
    fun solution(k: Int, arrayA: IntArray, arrayB: IntArray): Int {
        arrayA.sort()
        arrayB.sortDescending()

        for (i in 0 until k) {
            if (arrayA[i] < arrayB[i]) {
                arrayA[i] = arrayB[i].also { arrayB[i] = arrayA[i] }
            } else {
                break
            }
        }

        return arrayA.sum()
    }

    val result = solution(3, intArrayOf(1, 2, 5, 4, 3), intArrayOf(5, 5, 6, 6, 5))
    println(result)
}