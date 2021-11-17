package algorithm.programmers.greedy

fun main() {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = n
        val lostSet = lost.toSet() - reserve.toSet()
        val reserveSet = (reserve.toSet() - lost.toSet()) as MutableSet

        for (number in lostSet) {
            when {
                number + 1 in reserveSet -> reserveSet.remove(number + 1)
                number - 1 in reserveSet -> reserveSet.remove(number - 1)
                else -> answer--
            }
        }

        return answer
    }

//    val result = solution(5, intArrayOf(2, 4), intArrayOf(1, 3, 5))
//    val result = solution(5, intArrayOf(2, 4), intArrayOf(3))
    val result = solution(5, intArrayOf(2, 3, 4), intArrayOf(1, 2, 3))
    println(result)
}