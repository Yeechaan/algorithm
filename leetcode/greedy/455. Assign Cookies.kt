package algorithm.leetcode.greedy

fun main() {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        var answer = 0
        var childIndex = 0

        g.sort()
        s.sort()

        for (i in s.indices) {
            if (s[i] >= g[childIndex]) {
                answer++
                childIndex++
            }

            if (childIndex == g.size) break
        }

        return answer
    }

//    val result = findContentChildren(intArrayOf(1, 2, 3), intArrayOf(1, 1))
    val result = findContentChildren(intArrayOf(1, 2), intArrayOf(1, 2, 3))
    println(result)
}