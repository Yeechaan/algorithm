package algorithm.test

fun main() {

    fun Int.asBinaryReversed() = if (this == 0) 1 else 0

    fun solution(A: IntArray): Int {
        var answer = 0
        var answerReversed = 1

        var beforeBit = A[0]
        var beforeBitReversed = A[0].asBinaryReversed()

        for (i in 1 until A.size) {
            val currentBit = A[i]

            beforeBit = if (beforeBit == currentBit) {
                answer++
                beforeBit.asBinaryReversed()
            } else {
                currentBit
            }

            beforeBitReversed = if (beforeBitReversed == currentBit) {
                answerReversed++
                beforeBitReversed.asBinaryReversed()
            } else {
                currentBit
            }
        }

        return if (answer <= answerReversed) answer else answerReversed
    }

//    val result = solution(intArrayOf(0, 1, 1, 0))
//    val result = solution(intArrayOf(1, 0, 1, 0, 1, 1))
    val result = solution(intArrayOf(1, 1, 0, 1, 1))

    println(result)
}