package algorithm.leetcode.array

fun main() {
    fun restoreString(s: String, indices: IntArray): String {
        val answer = CharArray(s.length)

        indices.forEachIndexed { index, number ->
            answer[number] = s[index]
        }

        return String(answer)
    }

    val result = restoreString("codeleet", intArrayOf(4,5,6,7,0,2,1,3))
    println(result)
}