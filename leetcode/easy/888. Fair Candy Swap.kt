package algorithm.leetcode.easy

fun main() {
    fun fairCandySwap(aliceSizes: IntArray, bobSizes: IntArray): IntArray {
        val answer = IntArray(2)

        val aliceSum = aliceSizes.sum()
        val bobSum = bobSizes.sum()
        val diff = (bobSum - aliceSum) / 2

        val bobSet = bobSizes.toHashSet()

        for (alice in aliceSizes) {
            if (bobSet.contains(alice + diff)) {
                answer[0] = alice
                answer[1] = alice + diff
                break
            }
        }

        return answer
    }

    val result = fairCandySwap(intArrayOf(1, 1), intArrayOf(2, 2))
    println(result.toList())
}