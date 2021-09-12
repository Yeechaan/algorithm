package algorithm.test

fun main() {

    fun Long.isPrimeNumber(): Boolean {
        val number = this
        if (number.toInt() == 1) return false
        for (i in (2 until number.toInt())) {
            if (number.toInt() % i == 0) return false
        }
        return true
    }

    fun solution(n: Int, k: Int): Int {
        var answer: Int = 0
        val convertedNumber = n.toString(k)

        if (!convertedNumber.contains("0") && convertedNumber.toLong().isPrimeNumber())
            return answer + 1

        var index = 0
        var beginIndex = 0

        while (index < convertedNumber.length) {
            val isCurrentZero = convertedNumber[index] == '0'
            val isLastNumber = index == convertedNumber.length - 1

            val number = when {
                isCurrentZero -> {
                    val number = convertedNumber.substring(beginIndex, index).toLong()

                    beginIndex = index + 1
                    index++

                    number
                }
                isLastNumber -> convertedNumber.substring(beginIndex, index + 1).toLong()
                else -> 1
            }

            if (number.isPrimeNumber())
                answer++

            index++
        }

        return answer
    }

    val result = solution(437674, 3)
//    val result = solution(110011, 10)
    println(result)
}