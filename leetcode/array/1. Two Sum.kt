package algorithm.leetcode.array

fun main() {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var l = 0
        var r = numbers.size - 1
        while (l < r) {
            val sum = numbers[l] + numbers[r]
            when {
                (sum > target) -> r--
                (sum < target) -> l++
                else -> return intArrayOf(l + 1, r + 1)
            }
        }

        return intArrayOf(-1, -1)
    }

//    val result = twoSum(intArrayOf(2,7,11,15), 9)
    val result = twoSum(intArrayOf(2,3,4), 6)
//    val result = twoSum(intArrayOf(-1,0), -1)
//    val result = twoSum(intArrayOf(0,0,3,4), 0)

    println(result.toList())
}