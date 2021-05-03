package algorithm.programmers

fun main() {

    val n = readLine()!!.toInt()
    val lost = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    val reserve = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

    var answer = n - lost.size
    val reserveHashMap = hashMapOf<Int, Boolean>()
    reserve.map {
        reserveHashMap.put(it, false)
    }

    lost.map {
        val beforeStudent = it - 1
        val afterStudent = it + 1

        if (reserveHashMap.containsKey(beforeStudent) && !reserveHashMap.getValue(beforeStudent)) {
            answer++
            reserveHashMap[beforeStudent] = true
        } else if (reserveHashMap.containsKey(afterStudent) && !reserveHashMap.getValue(afterStudent)) {
            answer++
            reserveHashMap[afterStudent] = true
        } else if (reserveHashMap.containsKey(it) && !reserveHashMap.getValue(it)) {
            answer++
            reserveHashMap[it] = true
        }
    }
    println(answer)
}