package algorithm.leetcode.greedy

fun main() {
    fun minOperations(nums: IntArray): Int {
        var answer = 0

        for (i in 0 until nums.size - 1) {
            if (nums[i] >= nums[i + 1]) {
                val dif = (nums[i] - nums[i + 1]) + 1
                answer += dif
                nums[i + 1] += dif
            }
        }

        return answer
    }

    val result = minOperations(intArrayOf(1, 2, 3))
    println(result)
}