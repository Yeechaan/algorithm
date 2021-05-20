package algorithm.programmers.level_1

fun main() {

    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0

        absolutes.mapIndexed { index, number ->
            if (signs[index]) {
                answer += number
            } else {
                answer -= number
            }
        }

        return answer
    }

    val result = solution(intArrayOf(4,7,12), booleanArrayOf(true,false,true))
    println(result)
}