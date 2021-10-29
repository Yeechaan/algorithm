package algorithm.leetcode.easy

fun main() {
    fun subtractProductAndSum(n: Int): Int {
        var product = 1
        var sum = 0

        n.toString().forEach {
            product *= it - '0'
            sum += it - '0'
        }

        return product - sum
    }

    val result = subtractProductAndSum(4421)
    println(result)
}