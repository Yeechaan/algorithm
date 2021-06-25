package algorithm.leetcode.array

fun main() {
    fun singleNumber(nums: IntArray): Int {
        val numbers = mutableListOf<Int>()

        nums.map {
            if (!numbers.contains(it)) {
                numbers.add(it)
            } else {
                numbers.remove(it)
            }
        }

        return numbers[0]
    }

    val result = singleNumber(intArrayOf(1))
    println(result)
}