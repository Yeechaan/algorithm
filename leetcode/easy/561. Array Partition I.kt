package algorithm.leetcode.easy

fun main() {

    fun arrayPairSum(nums: IntArray): Int {
        nums.sort()
        return nums.filterIndexed { index, _ -> index % 2 == 0 }.sum()
    }

    val result = arrayPairSum(intArrayOf(6,2,6,5,1,2))
    println(result)
}