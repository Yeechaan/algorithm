package algorithm.leetcode.sorting

fun main() {
    fun sortSentence(s: String): String {
        var answer = ""

        val words = s.split(" ")
            .map {
                it.last() - '0' to it.dropLast(1)
            }.sortedBy { it.first }

        words.forEachIndexed { index, pair ->
            answer += pair.second

            if (index != words.size - 1)
                answer += " "
        }

        // better solution
//        s.split(" ").sortedBy { it.last() }.joinToString(" ") { it.dropLast(1) }

        return answer
    }

    val result = sortSentence("is2 sentence4 This1 a3")
    println(result)
}