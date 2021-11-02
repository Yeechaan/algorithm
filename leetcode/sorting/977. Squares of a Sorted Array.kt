package algorithm.leetcode.sorting

fun main() {
    fun sortedSquares(nums: IntArray): IntArray {
        val answer = IntArray(nums.size)
        var left = 0
        var right = nums.size - 1
        var current = nums.size - 1

        while (left <= right) {
            val leftSquare = nums[left] * nums[left]
            val rightSquare = nums[right] * nums[right]

            when {
                leftSquare > rightSquare -> {
                    answer[current] = leftSquare
                    left++
                }
                else -> {
                    answer[current] = rightSquare
                    right--
                }
            }

            current--
        }

        return answer
    }

    val result = sortedSquares(intArrayOf(-4,-1,0,3,10))
    println(result.toList())
}