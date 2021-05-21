package algorithm.programmers.level_1

fun main(args: Array<String>) {

    fun solution(answers: IntArray): IntArray {
        val answer = arrayListOf<Int>()
        val tempAnswer = intArrayOf(0, 0, 0)
        var maxAnswer = 0

        val firstPattern = intArrayOf(1, 2, 3, 4, 5)
        val secondPattern = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        val thirdPattern = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        answers.mapIndexed { index, it ->
            if (it == firstPattern[index % firstPattern.size]) tempAnswer[0]++
            if (it == secondPattern[index % secondPattern.size]) tempAnswer[1]++
            if (it == thirdPattern[index % thirdPattern.size]) tempAnswer[2]++
        }

        tempAnswer.map {
            if (it > maxAnswer) {
                maxAnswer = it
            }
        }

        tempAnswer.mapIndexed { index, i ->
            if (maxAnswer == i) {
                answer.add(index + 1)
            }
        }

        return answer.toIntArray()
    }

    val result = solution(intArrayOf(1, 2, 3, 4, 5))
//    val result = solution(intArrayOf(1, 3, 2, 4, 2))

    println(result.toList())
}