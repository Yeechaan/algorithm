package algorithm.leetcode.easy

fun main() {
    fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
        val rowSoldierCount = arrayListOf<Pair<Int, Int>>()

        mat.forEachIndexed { index, row ->
            rowSoldierCount.add(index to row.count { it == 1 })
        }

        rowSoldierCount.sortBy { it.second }

        return rowSoldierCount.subList(0, k).map { it.first }.toIntArray()
    }

    val result = kWeakestRows(
        arrayOf(
            intArrayOf(1, 1, 0, 0, 0),
            intArrayOf(1, 1, 1, 1, 0),
            intArrayOf(1, 0, 0, 0, 0),
            intArrayOf(1, 1, 0, 0, 0),
            intArrayOf(1, 1, 1, 1, 1)
        ),
        3
    )
    println(result.toList())
}