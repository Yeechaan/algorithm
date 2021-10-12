package algorithm.leetcode.binarysearch

fun main() {
    fun peakIndexInMountainArray(arr: IntArray): Int {
        var start = 0
        var end = arr.size - 1

        while (start < end) {
            val middle = (start + end) / 2

            if (arr[middle] < arr[middle + 1]) {
                start = middle + 1
            } else {
                end = middle
            }
        }

        return start
    }

    val result = peakIndexInMountainArray(intArrayOf(24,69,100,99,79,78,67,36,26,19))
    println(result)
}