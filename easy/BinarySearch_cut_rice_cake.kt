package algorithm.easy

fun main() {

    fun solution(items: IntArray, target: Int): Int {
        var answer = 0
        var start = 0
        var end = items.maxOrNull() ?: 0

        while (start <= end) {
            val middle = (start + end) / 2

            val sum = items.sumOf {
                if (it > middle) it - middle
                else 0
            }

            if (sum < target) {
                end = middle - 1
            } else {
                answer = middle
                start = middle + 1
            }
        }

        return answer
    }

    val result = solution(intArrayOf(19, 15, 10, 17), 6)
    println(result)
}