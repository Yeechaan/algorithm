package algorithm.leetcode.easy

fun main() {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        var answer = 0

        stones.forEach {
            if (jewels.contains(it)) answer++
        }

        return answer
    }

    val result = numJewelsInStones("aA", "aAAbbbb")
    println(result)
}