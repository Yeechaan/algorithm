package algorithm.leetcode.easy

fun main() {
    fun climbStairs(n: Int): Int {
        val dp = Array(n + 1) { 0 }

        dp.mapIndexed { index, _ ->
            when (index) {
                0 -> dp[index] = 0
                1 -> dp[index] = 1
                2 -> dp[index] = 2
                else -> dp[index] = dp[index - 1] + dp[index - 2]
            }
        }

        return dp[n]
    }


    val result = climbStairs(6)
    println(result)
}