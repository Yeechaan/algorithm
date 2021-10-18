package algorithm.leetcode.string

fun main() {

    fun interpret(command: String): String {
        var answer = ""

        answer = command.replace("()", "o")
        answer = answer.replace("(al)", "al")

        return answer
    }

    val result = interpret("G()(al)")
    println(result)
}