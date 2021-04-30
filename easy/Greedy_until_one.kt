fun main() {

    val numberOfAdventurer = readLine()!!.toInt()
    val fearOfAdventurers = readLine()!!.split(" ").map { it.toInt() }

    var result = 0
    var count = 0

    // 내가 푼
//    val sortedFearOfAdventurers = fearOfAdventurers.sorted()
//    var groupFirstIndex = 0
//    var groupFear = sortedFearOfAdventurers[groupFirstIndex]
//    var groupLastIndex = groupFirstIndex + groupFear - 1
//
//    while (groupFirstIndex <= groupLastIndex && groupLastIndex < sortedFearOfAdventurers.size - 1) {
//
//        val groupLastFear = sortedFearOfAdventurers[groupLastIndex]
//        if (groupFear == groupLastFear) {
//            result++
//            groupFirstIndex = groupLastIndex + 1
//        }
//
//        groupFear = sortedFearOfAdventurers[groupFirstIndex]
//        groupLastIndex = groupFirstIndex + groupFear - 1
//    }

    // 동빈나 쌤이 푼
    for (i in 0 .. numberOfAdventurer) {
        count += 1
        if (count >= fearOfAdventurers[i]) {
            result += 1
            count = 0
        }
    }

    println(result)
}