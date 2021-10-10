package algorithm.programmers.level_2

// 위장
fun main() {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 1
        val clothMap = mutableMapOf<String, Int>()

        clothes.forEach { cloth ->
            val key = cloth[1]

            clothMap[key]?.let {
                clothMap.put(key, it + 1)
            } ?: clothMap.put(key, 1)
        }

//        clothMap.values.fold(1) { acc, i -> acc * (i + 1) }
        clothMap.values.forEach {
            answer *= (it + 1)
        }

        return answer - 1
    }

    val result = solution(
        arrayOf(
            arrayOf("yellowhat", "headgear"),
            arrayOf("bluesunglasses", "eyewear"),
            arrayOf("green_turban", "headgear")
        )
    )
    println(result)
}