package algorithm.codility

fun main() {
    fun solution(A: IntArray): Int {

        val numberSet = (1..A.size + 1).toMutableSet()
        A.map {
            numberSet.remove(it)
        }

        return numberSet.first()
    }

    val result = solution(intArrayOf(2, 3, 1, 5))
    println(result)
}