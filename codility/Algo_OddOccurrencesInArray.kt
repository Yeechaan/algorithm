package algorithm.codility

fun main(args: Array<String>) {

    fun solution(A: IntArray): Int {
        var result = 0

        // O(N**2)
//        val resultMap = hashMapOf<Int, Int>()
//        A.map { item ->
//            if (!resultMap.containsKey(item)) {
//                resultMap[item] = 1
//            } else {
//                resultMap.put(item, resultMap.getValue(item) + 1)
//            }
//        }
//        resultMap.map {
//            if (it.value % 2 != 0) {
//                resut = it.key
//                return@map
//            }
//        }

        // O(N) or O(N*log(N))
        val sortedArray = A.sortedArray()
        for (i in sortedArray.indices step  2) {
            if ((i + 1) == sortedArray.size) {
                result = sortedArray[i]
                break
            }
            if (sortedArray[i] != sortedArray[i + 1]) {
                result = sortedArray[i]
                break
            }
        }

        return result
    }

    val result = solution(intArrayOf(9, 3, 9, 3, 9, 7, 9))
//    val result = solution(intArrayOf(7, 9, 3, 9, 3, 9, 9))
//    val result = solution(intArrayOf(1,1,1,1,1,1,1))

    println(result)
}