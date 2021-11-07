package algorithm.leetcode.array

fun main() {
    fun majorityElement(nums: IntArray): Int {
        val countNumbers = hashMapOf<Int, Int>()

        nums.forEach {
            countNumbers[it]?.let { value ->
                countNumbers[it] = value.plus(1)
            } ?: countNumbers.put(it, 1)
        }

        return  countNumbers.maxOfOrNull { it.key } ?: 0
    }

    val result = majorityElement(intArrayOf(3,4,4))
    println(result)
}