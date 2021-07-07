package algorithm.leetcode.array

fun main() {
    val romanIntegerMap = hashMapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    fun romanToInt(s: String): Int {
        var answer = 0
        var i = 0

        while (i < s.length) {
            val currentChar = s[i]

            if (i + 1 < s.length && (currentChar == 'I' || currentChar == 'X' || currentChar == 'C')) {
                val nextChar = s[i + 1]
                val exceptionNumber = "$currentChar$nextChar"

                if (exceptionNumber == "IV" || exceptionNumber == "IX" || exceptionNumber == "XL" || exceptionNumber == "XC" || exceptionNumber == "CD" || exceptionNumber == "CM") {
                    answer += (romanIntegerMap[nextChar]!! - romanIntegerMap[currentChar]!!)
                    i += 2
                    continue
                }
            }

            answer += romanIntegerMap[currentChar]!!
            i++
        }

        return answer
    }

    val result = romanToInt("DCXXI")
    println(result)
}