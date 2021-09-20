package algorithm.leetcode.easy

fun main() {
    fun numIdenticalPairs(nums: IntArray): Int {
        var answer = 0

        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[i] == nums[j])
                    answer++
            }
        }

        return answer
    }

    val result = numIdenticalPairs(intArrayOf(1, 1, 1, 1))
    println(result)
}