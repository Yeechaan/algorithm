package algorithm.leetcode.medium

fun main() {

    val keyMap = mapOf(
        '2' to "abc",
        '3' to "def",
        '4' to "ghi",
        '5' to "jkl",
        '6' to "mno",
        '7' to "pqr",
        '8' to "suv",
        '9' to "wxyz"
    )

    fun letterCombinations(digits: String): List<String> {
        val answer = mutableListOf<String>()
        if (digits.isEmpty()) return answer
        var word: String = ""

        fun dfs(cur: Int) {
            if (cur >= digits.length) {
                answer.add(word)
                return ;
            }
            for (i in keyMap[digits[cur]]!!) {
                word += i
                dfs(cur+1)
                word = word.substring(0, word.length-1)
            }
        }
        dfs(0)

        return answer
    }

    val result = letterCombinations("23")
    println(result)
}