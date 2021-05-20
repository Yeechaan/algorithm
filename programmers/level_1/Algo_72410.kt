package algorithm.programmers.level_1

fun main(args: Array<String>) {

    fun solution(new_id: String): String {
        var answer: String = ""

        answer = new_id.toLowerCase()
            .replace("[^a-z0-9-_.]".toRegex(), "")      // 소문자, 숫자, 기호[-_.] 제외한 문자 공백으로
            .replace("[.]{2,}".toRegex(), ".")          // 기호[.] 2개 이상이면 하나로 치환
            .replace("^[.]|[.]$".toRegex(), "")         // 맨앞, 맨뒤가 기호[.]이면 공백으로
            .replace("^$".toRegex(), "a")               // 빈문자열이면 a 입력

        if (answer.length > 15) {
            answer = answer.substring(0, 15)
            answer = answer.replace("[.]$".toRegex(), "")
        }

        if (answer.length <= 2) {
            while (answer.length < 3) {
                answer += answer.last()
            }
        }

        return answer
    }

    val result = solution("...!@BaT#*..y.abcdefghijklm")
//    val result = solution("z-+.^.")t
//    val result = solution("=.=")
//    val result = solution("123_.def")
//    val result = solution("abcdefghijklmn.p")

    println(result)
}