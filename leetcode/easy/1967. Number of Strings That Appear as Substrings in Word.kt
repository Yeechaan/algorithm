package algorithm.leetcode.easy

fun main() {
    fun numOfStrings(patterns: Array<String>, word: String): Int {
        var count = 0

        for (element in patterns){
            if(element in word) count++
        }

        return count
    }

    val result = numOfStrings(arrayOf("a","abc","bc","d"), "abc")
    println(result)
}