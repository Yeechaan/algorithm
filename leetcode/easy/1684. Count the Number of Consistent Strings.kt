package algorithm.leetcode.easy

fun main() {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        var answer = 0

        for (word in words) {
            val isAllowed = word.all {
                it in allowed
            }

            if (isAllowed) answer++
        }

        return answer
    }

    val result = countConsistentStrings("ab", arrayOf("ad","bd","aaab","baa","badab"))
    println(result)
}