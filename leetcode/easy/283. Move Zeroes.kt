package algorithm.leetcode.easy

fun main() {
    fun moveZeroes(nums: IntArray): Unit {
        var left = 0
        var right = 0
        while (right < nums.size) {
            if (nums[right] != 0) {
                val temp = nums[left]
                nums[left] = nums[right]
                nums[right] = temp
                left++
            }
            right++
        }
    }

//    val result = moveZeroes(intArrayOf(0,1,0,3,12))
    val result = moveZeroes(intArrayOf(0, 0, 1))
    println(result)
}