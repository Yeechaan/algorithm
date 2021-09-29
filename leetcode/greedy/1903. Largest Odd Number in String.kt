package algorithm.leetcode.greedy

fun main() {
    fun largestOddNumber(num: String): String {
        var answer = ""

        for (i in num.length - 1 downTo 0) {
            val number = num[i] - '0'
            if (number % 2 == 1) {
                answer = num.substring(0, i + 1)
                break
            }
        }

        return answer
    }

    val result = largestOddNumber("4206")
    println(result)
}