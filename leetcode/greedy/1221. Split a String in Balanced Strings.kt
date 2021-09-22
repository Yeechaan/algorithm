package algorithm.leetcode.greedy

fun main() {

    fun balancedStringSplit(s: String): Int {
        var counter = 0
        var maxAmount = 0

        s.forEach {
            if (it == 'R') counter++
            else counter--
            if (counter == 0) maxAmount++
        }

        return maxAmount
    }

    val result = balancedStringSplit("LLRRLR")
    println(result)
}