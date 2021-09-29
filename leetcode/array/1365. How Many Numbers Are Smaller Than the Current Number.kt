package algorithm.leetcode.array

fun main() {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val answer = IntArray(nums.size) { 0 }
        val sortedNumbers = nums.sorted()

        nums.forEachIndexed { index, number ->
            answer[index] = sortedNumbers.indexOf(number)
        }

        return answer
    }

//    val result = smallerNumbersThanCurrent(intArrayOf(8, 1, 2, 2, 3))
    val result = smallerNumbersThanCurrent(intArrayOf(6,5,4,8))
    println(result.toList())
}