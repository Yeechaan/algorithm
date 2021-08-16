package algorithm.test

import test.toss0814.Uri

fun main() {

    fun solution(input: String): Uri {
        val schemeSplit = input.split("://")
        val scheme = schemeSplit[0]
        val host = schemeSplit[1].substringBefore('/').substringBefore('?')

        var path = ""
        if (schemeSplit[1].contains('/')) {
            path += "/"
            path += schemeSplit[1].substringAfter('/').substringBefore('?')
        }

        val query = mutableMapOf<String, String?>()
        if (schemeSplit[1].contains('?')) {
            input.substringAfter('?').split('&').map {
                val queryItem = it.split('=')
                query[queryItem[0]] = queryItem[1]
            }
        }

        return Uri(scheme, host, path, query)
    }

//    val result = solution("https://naver.com")
//    val result = solution("https://naver.com/aaa/bbb")
    val result = solution("https://naver.com?bb=cc&ww=qq")

    println(result)
}