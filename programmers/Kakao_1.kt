package algorithm.programmers

import kotlin.math.abs

fun main(args: Array<String>) {
    val keypads = arrayOf(intArrayOf(3, 1), intArrayOf(0, 0), intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(1, 0), intArrayOf(1, 1), intArrayOf(1, 2), intArrayOf(2, 0), intArrayOf(2, 1), intArrayOf(2, 2))

    fun solution(numbers: IntArray, hand: String): String {
        var answer = ""
        var currentLeftHand = intArrayOf(3, 0)
        var currentRightHand = intArrayOf(3, 2)
        var distanceLeft = 0
        var distanceRight = 0

        numbers.map { number ->
            val nextHand = keypads[number]

            when (number) {
                1, 4, 7 -> {
                    answer += "L"
                    currentLeftHand = keypads[number]
                }
                3, 6, 9 -> {
                    answer += "R"
                    currentRightHand = keypads[number]
                }
                else -> {
                    val nextHandX = nextHand[0]
                    val nextHandY = nextHand[1]
                    val leftHandX = currentLeftHand[0]
                    val leftHandY = currentLeftHand[1]
                    val rightHandX = currentRightHand[0]
                    val rightHandY = currentRightHand[1]

                    distanceLeft = abs(nextHandX - leftHandX) + abs(nextHandY - leftHandY)
                    distanceRight = abs(nextHandX - rightHandX) + abs(nextHandY - rightHandY)

                    if (distanceLeft < distanceRight) {
                        answer += "L"
                        currentLeftHand = keypads[number]
                    } else if (distanceLeft > distanceRight) {
                        answer += "R"
                        currentRightHand = keypads[number]
                    } else {
                        if (hand == "left") {
                            answer += "L"
                            currentLeftHand = keypads[number]
                        } else {
                            answer += "R"
                            currentRightHand = keypads[number]
                        }
                    }
                }
            }
        }

        return answer
    }

    val result = solution(intArrayOf(1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5), "left")

    println(result)
}