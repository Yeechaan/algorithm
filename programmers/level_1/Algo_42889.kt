package algorithm.programmers.level_1

fun main(args: Array<String>) {

    fun solution(N: Int, stages: IntArray): IntArray {
        val stageUsers = IntArray(N + 1) { 0 }
        val userFailureRecord = hashMapOf<Int, Float>()
        var leftUser = stages.size

        stages.map {
            stageUsers[it - 1]++
        }

        for (i in 0 until stageUsers.lastIndex) {
            if (stageUsers[i] != 0) {
                userFailureRecord[i + 1] = stageUsers[i].toFloat() / leftUser.toFloat()
            } else {
                userFailureRecord[i + 1] = 0.0f
            }
            leftUser -= stageUsers[i]
        }

        return userFailureRecord.toList()
            .sortedByDescending { (_, value) -> value }
            .toMap()
            .keys
            .toIntArray()
    }

//    val result = solution(5, intArrayOf(2, 2, 2, 6, 2, 4, 3, 3))
//    val result = solution(4, intArrayOf(4,4,4,4,4))
    val result = solution(4, intArrayOf(1,1,1,1,1))

    println(result.toList())
}