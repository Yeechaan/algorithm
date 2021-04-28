fun main() {

    val numberString = readLine()!!
    var result = Character.getNumericValue(numberString[0])
//    var result = numberString[0] - '0'

    for (i in 1 until numberString.length) {
        // 내가 푼
        val firstNumber = result
        val secondNumber = Character.getNumericValue(numberString[i])

        val addResult = firstNumber + secondNumber
        val multipleResult = firstNumber * secondNumber

        result = if (addResult >= multipleResult) {
            addResult
        } else {
            multipleResult
        }

        // 동빈나 쌤이 푼
//        val secondNumber = Character.getNumericValue(numberString[i])
//
//        result = if (result <= 1 || secondNumber <= 1) {
//            result + secondNumber
//        } else {
//            result * secondNumber
//        }
    }

    println(result)
}