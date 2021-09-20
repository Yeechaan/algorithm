package algorithm.leetcode.easy

fun main() {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val answer = IntArray(nums.size)

        var beginIndex = 0
        var halfIndex = n
        (0 until n).map {
            answer[it * 2] = nums[beginIndex++]
            answer[(it * 2) + 1] = nums[halfIndex++]
        }

        return answer
    }

    val result = shuffle(intArrayOf(1,2,3,4,4,3,2,1), 4)
    println(result.toList())
}