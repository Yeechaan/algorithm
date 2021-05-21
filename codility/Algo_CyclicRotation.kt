package algorithm.codility

fun main(args: Array<String>) {

    fun solution(A: IntArray, K: Int): IntArray {

        if (A.isEmpty()) {
            return intArrayOf()
        }

        val result: IntArray
        val moveIndex = K % A.size

        result = A.sliceArray(IntRange(A.lastIndex - moveIndex + 1, A.lastIndex)) + A.sliceArray(IntRange(0, A.lastIndex - moveIndex))

        return result
    }

//    val result = solution(intArrayOf(3, 8, 9, 7, 6), 3)
//    val result = solution(intArrayOf(0,0,0), 1)
    val result = solution(intArrayOf(), 1)      // check if there is empty array

    println(result.toList())
}