package algorithm.programmers.level_2

fun main() {
    fun solution(numbers: IntArray): String {
        var stringNumbers = arrayOf<String>()
        numbers.map {
            stringNumbers += it.toString()
        }

        stringNumbers.sortWith { first, second ->
            if (first.length == second.length) {
                second.compareTo(first)
            } else {
                (second + first).compareTo(first + second)
            }
        }

        if (stringNumbers[0] == "0") {
            return "0"
        }

        return stringNumbers.joinToString("")
    }

    val result = solution(intArrayOf(3, 30, 34, 5, 9))
    println(result)
}