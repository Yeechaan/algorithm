package algorithm.leetcode.easy

fun main() {
    fun missingNumber(nums: IntArray): Int {
        var bits = 0

        for (n in nums)
            bits = bits xor n

        // A ^ A = 0
        for (i in 0..nums.size)
            bits = bits xor i

        return bits
    }

    val result = missingNumber(intArrayOf(3, 0, 1))
    println(result)
}