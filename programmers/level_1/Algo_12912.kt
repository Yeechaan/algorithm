package algorithm.programmers.level_1

fun main() {

    fun solution(a: Int, b: Int): Long {
        var startNumber = Integer.min(a, b)
        var endNumber= Integer.max(a, b)

        if (startNumber < 0 && endNumber > 0) {
            if (Math.abs(startNumber) > Math.abs(endNumber)) {
                endNumber = -endNumber - 1
            } else {
                startNumber = Math.abs(startNumber) + 1
            }
        }

        return (startNumber .. endNumber).sum().toLong()

        // return (Math.abs(a - b) + 1L) * (a + b) / 2L
    }

    val result = solution(-3, 5)
//    val result = solution(3, 5)

    println(result)
}