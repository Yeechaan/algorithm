package algorithm.leetcode.array

fun main() {
    fun maxSubArray(nums: IntArray): Int {
        var answer = nums[0]
        var sum = nums[0]

        for (i in 1 until nums.size) {
            sum += nums[i]
            if (sum < nums[i]) {
                sum = nums[i]
            }
            if (sum > answer) {
                answer = sum
            }
        }

        return answer
    }

    val result = maxSubArray(intArrayOf(5,4,-1,7,8))
    println(result)
}