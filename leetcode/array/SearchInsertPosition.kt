package algorithm.leetcode.array

fun main() {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var answer = -1

        for (index in nums.indices) {
            if (nums[index] >= target) {
                answer = index
                break
            }
            if (index == nums.lastIndex) {
                answer = index + 1
            }
        }

        return answer
    }

    val result = searchInsert(intArrayOf(1,3,5,6), 0)
//    val result = searchInsert(intArrayOf(1), 0)
    println(result)
}