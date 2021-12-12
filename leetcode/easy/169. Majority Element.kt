package algorithm.leetcode.easy

fun main() {
    fun majorityElement(ar: IntArray) =
        ar.sorted()[ar.size / 2]

    val result = majorityElement(intArrayOf(2, 2, 3, 3, 1, 1, 1, 2, 2))
    println(result)
}