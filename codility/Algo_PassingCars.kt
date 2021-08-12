package algorithm.codility

fun main() {
fun solution(A: IntArray): Int {
    var answer = 0
    var countEast = 0
    var countWest = 0

    for (i in 0 until A.size - 1) {
        val currentNumber = A[i]
        val nextNumber = A[i+1]

        when {
            currentNumber == 0 && nextNumber == 1 -> {
                countEast++
                countWest++
            }
            currentNumber == 1 && nextNumber == 1 -> {
                countWest++
            }
            else -> {
                answer += (countEast * countWest)
                countWest = 0
            }
        }

        if (i == A.size - 2 && nextNumber == 1) {
            answer += (countEast * countWest)
        }
    }

    return answer
}

//    val result = solution(intArrayOf(0,1,0,1,1))
    val result = solution(intArrayOf(0,1,0,1,1,0,1,0,1,1))

    println(result)
}