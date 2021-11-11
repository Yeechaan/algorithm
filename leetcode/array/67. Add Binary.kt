package algorithm.leetcode.array

fun main() {
    fun addBinary(a: String, b: String): String {
        val answer = (a.toBigInteger(2) + b.toBigInteger(2)).toString(2)
        return answer
    }

    val result = addBinary("1010", "1011")
    println(result)
}