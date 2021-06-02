package algorithm.programmers.level_1

fun main() {
    // 풀이 최적화
    fun solution(arr: IntArray): IntArray =
        if (arr.size == 1 || arr.toSet().size == 1) {
            intArrayOf(-1)
        } else {
            arr.filter {
                it != arr.minOrNull() ?: -1
            }.toIntArray()
        }

//    fun solution(arr: IntArray): IntArray {
//        val answer = arr.toMutableList()
//
//        if (arr.size == 1 || arr.toSet().size == 1) {
//            return intArrayOf(-1)
//        }
//
//        var minNumber = arr[0]
//        var minIndex = 0
//
//        for (i in 1 until arr.size) {
//            if (minNumber > arr[i]) {
//                minNumber = arr[i]
//                minIndex = i
//            }
//        }
//        answer.removeAt(minIndex)
//
//        return answer.toIntArray()
//    }

    //    val result = solution(2, 5)
    val result = solution(intArrayOf(1, 2))

    println(result.toList().toString())
}