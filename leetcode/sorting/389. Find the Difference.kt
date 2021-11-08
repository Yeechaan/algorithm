package algorithm.leetcode.sorting

fun main() {
    fun findTheDifference(s: String, t: String): Char? {
        val sl = s.toCharArray().toMutableList()

        t.forEach {
            if (!sl.remove(it))
                return it
        }

        return null
    }

    val result = findTheDifference("abcd", "abcde")
    println(result)
}