package algorithm.programmers.level_1

fun main(args: Array<String>) {

    fun solution(s: String): String {
        val size = s.length

        if (size == 1) {
            return s
        }

        return if (size % 2 == 0) {
            s.substring((size / 2) - 1, (size / 2) + 1)
        } else {
            s[(size / 2)].toString()
        }
    }


    val result = solution("abcde")
//    val result = solution("aavvcc")
//    val result = solution("a")

    println(result)
}