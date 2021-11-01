package algorithm.leetcode.easy

fun main() {
    fun reversePrefix(word: String, ch: Char): String {
        val answer = StringBuilder()

        word.indexOfFirst { it == ch }.let {
            answer.append(word.subSequence(0, it + 1).reversed())
            answer.append(word.subSequence(it + 1, word.length))
        }

        return answer.toString()
    }

    val result = reversePrefix("abcdefd", 'd')
    println(result)
}