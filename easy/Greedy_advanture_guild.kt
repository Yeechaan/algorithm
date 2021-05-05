fun main() {

    val numberString = readLine()!!
    var result = Character.getNumericValue(numberString[0])

    for (i in 1 until numberString.length) {
        val firstNumber = result
        val secondNumber = Character.getNumericValue(numberString[i])

        val addResult = firstNumber + secondNumber
        val multipleResult = firstNumber * secondNumber

        result = if (addResult >= multipleResult) {
            addResult
        } else {
            multipleResult
        }
    }

    println(result)
}