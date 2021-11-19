package algorithm.baekjoon.bruteforce

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val (size, target) = readLine()!!.split(' ').map(String::toInt)
    val items = IntArray(size)

    for (i in 0 until size) {
        items[i] = sc.nextInt()
    }

//    val br = BufferedReader(InputStreamReader(System.`in`))
//
//    var token = StringTokenizer(br.readLine())
//    val n = token.nextToken().toInt()
//    val m = token.nextToken().toInt()
//
//    token = StringTokenizer(br.readLine())
//    val numbers = mutableListOf<Int>()
//    for (i in 0 until n){
//        numbers.add(token.nextToken().toInt())
//    }

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

    var answer = 0
    val combination = mutableListOf<List<Int>>()
    combination(combination, items.toList(), Array(size) { false }, 0, 3)
    combination.forEach {
        val sum = it.sum()
        if (sum in (answer + 1)..target) {
            answer = sum
        }
    }

    println(answer)
}