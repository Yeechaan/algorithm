package algorithm.programmers.level_1

import kotlin.math.sqrt

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

    fun checkPrimeNumber(number: Int): Boolean =  run{
        val primeRange = sqrt(number.toDouble()).toInt()

        for (i in 2 .. primeRange) {
            if (number % i == 0) {
                return@run false
            }
        }
        return@run true
    }

    fun solution(nums: IntArray): Int {
        var answer = 0

        val list = mutableListOf<List<Int>>()
        combination(list, nums.toList(), Array<Boolean>(nums.toList().size) { false }, 0, 3)
        list.map {
            if (checkPrimeNumber(it[0] + it[1] + it[2])) {
                answer++
            }
        }

        return answer
    }

    val result = solution(intArrayOf(1, 2, 7, 6, 4))
    println(result)
}