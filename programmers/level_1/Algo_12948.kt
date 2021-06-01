package algorithm.programmers.level_1

fun  main() {
    fun solution(phone_number: String): String {
        var answer = ""

        for (i in 0 until phone_number.length - 4) {
            println(phone_number[i])
            answer += "*"
        }
        answer += phone_number.substring(phone_number.length - 4, phone_number.length)

        return answer
    }

    val result = solution("01033334444")

    println(result)
}