package algorithm.leetcode.array

fun main() {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var index = 0

        nums.map {
            if (it != `val`) {
                nums[index++] = it
            }
        }

        return index
    }

    val result = removeElement(intArrayOf(0,1,2,2,3,0,4,2), 2)
    println(result)
}