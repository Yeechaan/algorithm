package algorithm.leetcode.greedy

fun main() {
    fun longestPalindrome(s: String): Int {
        var answer = 0
        val count = IntArray(128) { 0 }

        s.forEach {
            count[it - '0']++
        }

        count.forEach {
            answer += (it / 2) * 2
            if ((answer % 2 == 0) && it % 2 == 1)
                answer++
        }

        return answer
    }

    val result = longestPalindrome("abccccdd")
//    val result = longestPalindrome("bb")
//    val result = longestPalindrome("a")
    println(result)
}