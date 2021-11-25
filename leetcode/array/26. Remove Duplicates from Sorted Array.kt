package algorithm.leetcode.array

fun main() {
    fun removeDuplicates(nums: IntArray): Int {
        var index = 0
        var number = Int.MIN_VALUE

        nums.map {
            if (it != number) {
                nums[index++] = it
                number = it
            }
        }

        return index
    }

    val result = removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4))

    println(result)
}