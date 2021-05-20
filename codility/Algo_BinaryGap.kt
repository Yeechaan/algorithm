package algorithm.codility

fun main(args: Array<String>) {

    fun solution(N: Int): Int {
        var answer = 0

        val binaryGaps = Integer.toBinaryString(N).split("1").toMutableList()

        binaryGaps.removeAt(0)
        binaryGaps.removeAt(binaryGaps.lastIndex)

        binaryGaps.map {
            if (it.length > answer) {
                answer = it.length
            }
        }

        return answer
    }

    val result = solution(1041)

    println(result)
}