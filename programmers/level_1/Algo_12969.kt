package algorithm.programmers.level_1

fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)

    for (i in 0 until b) {
        var star = ""

        for (j in 0 until a) {
            star += "*"
        }
        println(star)
    }

    println(a + b)
}