package algorithm.leetcode.easy

fun main() {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var answer = 0

        accounts.forEach {
            val sum = it.sum()
            if (answer < sum) answer = sum
        }

        return answer
    }

    val result = maximumWealth(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6)))
    println(result)
}