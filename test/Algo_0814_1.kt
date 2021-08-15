package algorithm.test

import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main() {

    fun solution(date: String, requests: Array<String>): Int {
        var answer = 0

        val standardYear: Long = 20
        val formatter = DateTimeFormatter.ofPattern("yyyyMMdd")
        val standardDate: LocalDate = LocalDate.parse(date, formatter).minusYears(standardYear)

        requests.map {
            val birthDate = LocalDate.parse(it.replace("[^0-9]".toRegex(), ""), formatter)

            if (standardDate >= birthDate) answer++
        }

        return answer
    }

    val result = solution("20200702", arrayOf("김토스,20000701", "이토스,20000702", "치토스,20000703"))
    println(result)
}