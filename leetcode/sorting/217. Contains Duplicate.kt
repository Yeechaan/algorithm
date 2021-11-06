package algorithm.leetcode.sorting

fun main() {
    fun containsDuplicate(nums: IntArray): Boolean {
        val hashNumbers = hashSetOf<Int>()

        nums.forEach {
            if (hashNumbers.contains(it)) {
                return true
            } else {
                hashNumbers.add(it)
            }
        }

        return false
    }

    val result = containsDuplicate(intArrayOf(1,2,3,1))
    println(result)
}