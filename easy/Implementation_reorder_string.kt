fun main() {

    val inputString = readLine()!!

    var result = ""

    var sum = 0
    val number = inputString.replace("[^0-9]".toRegex(), "")
    number.map {
        sum += (it - '0')
    }

    result = inputString.replace("[0-9]".toRegex(), "")
    result = result.toCharArray().sorted().joinToString("") + sum.toString()

    println(result)
}