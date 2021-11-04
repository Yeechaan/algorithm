package algorithm.leetcode.sorting

fun main() {
    fun sortSentence(s: String): String {
        return s.split(" ")
            .sortedBy { it.last() }
            .joinToString(" ")
            { it.dropLast(1) }
    }

    val result = sortSentence("is2 sentence4 This1 a3")
    println(result)
}