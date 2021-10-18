package algorithm.leetcode.easy

fun main() {
    fun intersection(nums1: IntArray, nums2: IntArray) =
        nums1.toSet().intersect(nums2.toSet()).toIntArray()

    val result = intersection(intArrayOf(1, 2, 2, 3), intArrayOf(2, 3))
    println(result.toList())
}