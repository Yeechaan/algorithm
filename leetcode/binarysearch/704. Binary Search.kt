package algorithm.leetcode.binarysearch

fun main() {
    fun search(nums: IntArray, target: Int): Int {
        var answer = -1
        var start = 0
        var end = nums.size - 1

        while (start <= end) {
            val middle = (start + end) / 2

            if (nums[middle] == target) {
                answer = middle
                break
            } else if (nums[middle] < target) {
                start = middle + 1
            } else {
                end = middle - 1
            }
        }

        return answer
    }

    val result = search(intArrayOf(-1, 0, 3, 5, 9, 12), 9)
    println(result)
}