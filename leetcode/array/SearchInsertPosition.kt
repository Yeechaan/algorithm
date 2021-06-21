package algorithm.leetcode.array

fun main() {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var low = 0
        var high = nums.size - 1
        while (low <= high) {
            val mid = (low + high) / 2
            when {
                nums[mid] == target -> return mid
                (nums[mid] > target) -> high = mid - 1
                else -> low = mid + 1
            }
        }
        return low
    }

    val result = searchInsert(intArrayOf(1, 3, 5, 6), 0)
//    val result = searchInsert(intArrayOf(1), 0)
    println(result)
}