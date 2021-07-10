package question

fun main() {
    fun solution(bricks: IntArray, n: Int, k: Int): Int {
        var answer: Int = 0
        var pool = 1

        while (pool != k) {
            var filledIndex = 0
            var minBrickCount = n

            for (i in 1 until bricks.size - 1) {
                val needBrick = n - bricks[i]

                if (needBrick != 0 && needBrick <= minBrickCount && bricks[i - 1] != n && bricks[i + 1] != n) {
                    minBrickCount = needBrick
                    filledIndex = i
                }
            }

            pool += 1
            answer += n - bricks[filledIndex]
            bricks[filledIndex] = n
        }

        return answer
    }

//    val result = solution(intArrayOf(1, 2, 5, 3, 1, 0, 2, 3), 6, 3)
//    val result = solution(intArrayOf(0, 1, 2, 3, 4), 5, 2)
    val result = solution(intArrayOf(0, 1, 2, 3, 4, 3), 5, 2)

    println(result)
}