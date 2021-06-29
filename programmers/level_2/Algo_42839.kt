package algorithm.programmers.level_2

fun main() {

    fun <T> combination(answer: MutableList<List<T>>, el: List<T>, ck: Array<Boolean>, start: Int, target: Int) {
        if (target == 0) {
            answer.addAll(listOf(el.filterIndexed { index, t -> ck[index] }))
        } else {
            for (i in start until el.size) {
                ck[i] = true
                combination(answer, el, ck, i + 1, target - 1)
                ck[i] = false
            }
        }
    }

    fun <T> permutation(el: List<T>, fin: List<T> = listOf(), sub: List<T> = el): List<List<T>> {
        return if (sub.isEmpty()) listOf(fin)
        else sub.flatMap { permutation(el, fin + it, sub - it) }
    }

    fun isPrimeNumber(number: Int): Boolean {
        if (number == 0 || number == 1) return false

        val sqrtNumber = Math.sqrt(number.toDouble()).toInt()
        for (i in 2..sqrtNumber) {
            if (number % i == 0) return false
        }

        return true
    }

    fun solution(numbers: String): Int {
        val answer = mutableSetOf<Int>()

        for (i in 1..numbers.length) {
            val combinations = mutableListOf<List<Char>>()

            combination(combinations, numbers.toList(), Array(numbers.length) { false }, 0, i)
            combinations.forEach { combination ->
                permutation(combination).forEach {
                    val number = it.joinToString("").toInt()
                    if (isPrimeNumber(number)) answer.add(number)
                }
            }
        }

        return answer.size
    }

    val result = solution("011")
    println(result)
}