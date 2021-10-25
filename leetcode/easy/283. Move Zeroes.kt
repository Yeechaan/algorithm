package algorithm.leetcode.easy

fun main() {
    fun moveZeroes(nums: IntArray): Unit {
        for (i in nums.indices) {
            if (nums[i] == 0) {
                for (j in i until nums.size - 1) {
                    val temp = nums[j + 1]
                    nums[j + 1] = nums[j]
                    nums[j] = temp
                }
            }
        }
    }

//    val result = moveZeroes(intArrayOf(0,1,0,3,12))
    val result = moveZeroes(intArrayOf(0, 0, 1))
    println(result)
}