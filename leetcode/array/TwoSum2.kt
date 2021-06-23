package algorithm.leetcode.array

fun main() {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val answer = IntArray(2)

        loop@ for (i in numbers.indices) {
            for (j in i + 1 until numbers.size) {
                val targetNumber = target - numbers[i]
                if (targetNumber == numbers[j]) {
                    answer[0] = i + 1
                    answer[1] = j + 1
                    break@loop
                }
            }
        }

        return answer
    }

//    val result = twoSum(intArrayOf(2,7,11,15), 9)
//    val result = twoSum(intArrayOf(2,3,4), 6)
//    val result = twoSum(intArrayOf(-1,0), -1)
    val result = twoSum(intArrayOf(0,0,3,4), 0)

    println(result.toList())
}