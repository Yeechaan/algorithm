package algorithm.leetcode.easy

fun main() {
    fun maxProductDifference(nums: IntArray): Int {
        val sortedNumbers = nums.sorted()
        return (sortedNumbers[nums.size - 1] * sortedNumbers[nums.size - 2]) - (sortedNumbers[0] * sortedNumbers[1])
    }

    val result = maxProductDifference(intArrayOf(5,6,2,7,4))
    println(result)
}