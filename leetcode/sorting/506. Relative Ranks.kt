package algorithm.leetcode.sorting

fun main() {
    fun findRelativeRanks(score: IntArray): Array<String> {
        val answer = arrayListOf<String>()
        val map = mutableMapOf<Int, Int>()
        score.sortedDescending().forEachIndexed { index, i ->
            map[i] = index + 1
        }

        score.map {
            val rank = when (map[it]) {
                1 -> "Gold Medal"
                2 -> "Silver Medal"
                3 -> "Bronze Medal"
                else -> map[it].toString()
            }
            answer.add(rank)
        }

        return answer.toTypedArray()
    }

    val result = findRelativeRanks(intArrayOf(10, 3, 8, 9, 4))
    println(result.toList())
}