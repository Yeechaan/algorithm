fun main() {

    val boardSize = readLine()!!.toInt()
    val plans = readLine()!!.split(" ").map { it }

    val moveTypes = hashMapOf<String, IntArray>("R" to intArrayOf(0, 1), "L" to intArrayOf(0, -1), "D" to intArrayOf(1, 0), "U" to intArrayOf(-1, 0))

    var currentX = 0
    var currentY = 0

    plans.map { plan ->
        val tempX = currentX + moveTypes[plan]?.get(0)!!
        val tempY = currentY + moveTypes[plan]?.get(1)!!

        if (tempX in 0 until boardSize && tempY in 0 until boardSize) {
            currentX = tempX
            currentY = tempY
        }
    }

    println("${currentX + 1} ${currentY + 1}")
}