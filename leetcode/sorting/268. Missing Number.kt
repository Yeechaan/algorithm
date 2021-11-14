package algorithm.leetcode.sorting

fun main() {
    fun missingNumber(nums: IntArray): Int {
        var answer = 0

        nums.sorted().forEachIndexed { index, number ->
            if (index != number && nums.size == index -1) {
                answer = index
            } else {
                answer = index + 1
            }
        }

        return answer
    }

//    val result = missingNumber(intArrayOf(3, 0, 1))
    val result = missingNumber(intArrayOf(0, 1))
    println(result)
}