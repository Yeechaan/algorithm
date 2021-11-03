package algorithm.leetcode.sorting

fun main() {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        return nums1.filter { nums2.contains(it) }.toSet().toIntArray()
    }

    val result = intersection(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2))
    println(result.toList())
}