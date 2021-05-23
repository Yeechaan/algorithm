package algorithm.programmers.level_1

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

    fun solution(numbers: IntArray): IntArray {
        val answerSet = mutableSetOf<Int>()
        val listOfCombination = mutableListOf<List<Int>>()
        combination(listOfCombination, numbers.toList(), Array<Boolean>(numbers.size) { false }, 0,  2)

        listOfCombination.map {
            answerSet.add(it[0] + it[1])
        }

        return answerSet.sorted().toIntArray()
    }

//    solution(intArrayOf(2,1,3,4,1))
    val result = solution(intArrayOf(5,0,2,7))

    println(result)
}