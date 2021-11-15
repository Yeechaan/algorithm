package algorithm.test

fun main() {

    fun <T> combination(answer: MutableList<List<T>>, el: List<T>, ck: Array<Boolean>, start: Int, target: Int) {
        if(target == 0) {
            answer.addAll( listOf(el.filterIndexed { index, t -> ck[index] }) )
        } else {
            for(i in start until el.size) {
                ck[i] = true
                combination(answer, el, ck, i + 1, target - 1)
                ck[i] = false
            }
        }
    }

    fun solution(A: Array<String>): Int {
        var count = 0

        for(i in 1 .. A.size) {
            val answer = mutableListOf<List<String>>()
            combination(answer, A.toList(), Array(A.size) { false }, 0,  i)

            answer.forEach { list ->
                var text = ""
                list.map { text += it }

                if (text.length == text.toSet().size && count <= text.length) {
                    count = text.length
                }
            }
        }

        return count
    }

//    val result = solution(arrayOf("co", "dil", "ity"))
    val result = solution(arrayOf("abc", "yyy", "def", "scv"))
//    val result = solution(arrayOf("ccc", "yyy", "eee", "xxx"))

    println(result)
}