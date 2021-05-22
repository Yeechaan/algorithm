package algorithm.programmers.level_1

fun main(args: Array<String>) {

    fun solution(s: String): String = run {
        s.toCharArray().sorted().joinToString("")
    }


    val result = solution("Zbcdefg")
//    val result = solution("aavBBBvcc")
//    val result = solution("a")

    println(result)
}