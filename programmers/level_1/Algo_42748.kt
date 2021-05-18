package algorithm.programmers.level_1

fun main(args: Array<String>) {

    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = IntArray(commands.size)

        commands.mapIndexed { index, command ->
            val from = command[0] - 1
            val to = command[1] - 1
            val where = command[2] - 1
            val sortedSubArray = array.slice(IntRange(from, to)).sorted()

            answer[index] = sortedSubArray[where]
        }

        return answer
    }

    val result = solution(intArrayOf(1, 5, 2, 6, 3, 7, 4), arrayOf(intArrayOf(2, 5, 3), intArrayOf(4, 4, 1), intArrayOf(1, 7, 3)))

    println(result)
}