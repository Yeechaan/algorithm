package algorithm.leetcode.greedy

fun main() {
    fun maximum69Number(num: Int): Int {
        val numString = num.toString()
        var answer = numString

        for (i in numString.indices) {
            val number = numString[i]
            if (number == '6') {
                answer = numString.replaceRange(i, i + 1, "9")
                break
            }
        }

        return answer.toInt()
    }

    val result = maximum69Number(9669)
    println(result)
}