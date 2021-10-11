package algorithm.programmers.level_3

fun main() {
    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        val answer = genres.indices.groupBy { genres[it] }
            .toList()
            .sortedByDescending { it.second.sumBy { index -> plays[index] } }
            .map { it.second.sortedByDescending { index -> plays[index] }.take(2) }
            .flatten()

        return answer.toIntArray()
    }

    val result = solution(
        arrayOf("classic", "pop", "classic", "classic", "pop"),
        intArrayOf(500, 600, 150, 800, 2500)
    )
    println(result.toList())
}