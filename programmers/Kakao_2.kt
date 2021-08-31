package programmers

fun main() {

    fun calculateNumbers(operator: Char, firstNumber: Int, secondNumber: Int): Int =  run{
        when (operator) {
            '+' -> firstNumber + secondNumber
            '-' -> firstNumber - secondNumber
            else -> firstNumber * secondNumber
        }
    }

    val twoOperators = arrayListOf<String>()
    val threeOperators = arrayListOf<String>("+-*", "+*-", "-+*", "-*+", "*+-", "*-+")

    val expression = readLine()!!
    var answer = 0

    val operators = mutableSetOf<Char>()

    expression.map {
        when (it) {
            '+', '-', '*' -> operators.add(it)
            else -> {  }
        }
    }

    when (operators.size) {
        1 -> {
            val operator = operators.toCharArray()[0]
            expression.split("$operator").mapIndexed { index, s ->
                answer += calculateNumbers(operator, answer, s.toInt())
            }
        }
    }

    println(answer)
}