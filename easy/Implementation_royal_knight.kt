fun main() {

    val boardSize = 8
    val currentPosition = readLine()!!

    val moveCases = arrayListOf("RRD", "RRU", "LLD", "LLU", "DDR", "DDL", "UUR", "UUL")
    val moveTypes = hashMapOf('R' to intArrayOf(0, 1), 'L' to intArrayOf(0, -1), 'D' to intArrayOf(1, 0), 'U' to intArrayOf(-1, 0))

    var result = 0
    val currentX = currentPosition[1] - '0' - 1
    val currentY = currentPosition[0] - 'a'

    moveCases.map { case ->
        var tempX = currentX
        var tempY = currentY

        case.map { direction ->
            tempX += moveTypes[direction]?.get(0)!!
            tempY += moveTypes[direction]?.get(1)!!
        }

        if (tempX in 0 until boardSize && tempY in 0 until boardSize) {
            result++
        }
    }

    println(result)
}