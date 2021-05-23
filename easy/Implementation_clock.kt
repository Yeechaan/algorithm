// 완전탐색
fun main() {

    fun isMatchThree(hour: Int, minute: Int, second: Int) = run {
        hour % 10 == 3 || minute / 10 == 3 || minute % 10 == 3 || second / 10 == 3 || second % 10 == 3
    }

    val targetHour = readLine()!!.toInt()
    var result = 0

    for (hour in 0..targetHour) {
        for (minute in 0..59) {
            for (second in 0..59) {
                if (isMatchThree(hour, minute, second)) {
                    result++
                }
            }
        }
    }

    println(result)
}