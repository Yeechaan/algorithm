package algorithm.programmers.level_1

fun main() {

    fun solution(strings: Array<String>, n: Int): Array<String> {
        val answer = arrayListOf<String>()
        val wordsMap = hashMapOf<Char, ArrayList<String>>()

        strings.map {
            if (wordsMap.contains(it[n])) {
                wordsMap[it[n]]?.add(it)
            } else {
                wordsMap[it[n]] = arrayListOf(it)
            }
        }

        wordsMap.toSortedMap().values.map {
            val sortedValues = it.sorted().toTypedArray()
            answer.addAll(sortedValues)
        }

        // 다른 풀이
//        return strings.also {
//            it.sort()
//            it.sortBy { it[n] }
//        }

        return answer.toTypedArray()
    }

    val result = solution(arrayOf("sun", "bed", "car", "caa"), 1)
//    val result = solution(arrayOf("abce", "abcd", "cdx"), 2)

    println(result.toList())
}