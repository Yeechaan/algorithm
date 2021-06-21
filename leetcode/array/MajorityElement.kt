package algorithm.leetcode.array

fun main() {
    fun majorityElement(nums: IntArray): Int {
        val countNumbers = hashMapOf<Int, Int>()

        nums.forEach {
            countNumbers[it]?.let { value ->
                countNumbers[it] = value.plus(1)
            } ?: countNumbers.put(it, 1)
        }

        var maxCountNumber = Int.MIN_VALUE
        var maxCount = Int.MIN_VALUE
        countNumbers.map { (key, value) ->
            if (value > maxCount) {
                maxCount = value
                maxCountNumber = key
            }
        }

        return  maxCountNumber
    }

    val result = majorityElement(intArrayOf(3,3,4))
    println(result)
}