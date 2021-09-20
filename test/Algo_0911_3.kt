package algorithm.test

import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.ceil

fun main() {

    fun getTimeDiff(startTime: String, endTime: String): Long {
        val calendar = Calendar.getInstance()

        val startTimes = startTime.split(":")
        calendar.set(2021, 9, 11, startTimes[0].toInt(), startTimes[1].toInt())
        val begin = calendar.timeInMillis

        val endTimes = endTime.split(":")
        calendar.set(2021, 9, 11, endTimes[0].toInt(), endTimes[1].toInt())
        val end = calendar.timeInMillis

        return (end - begin) / 60000
    }

    fun solution(fees: IntArray, records: Array<String>): IntArray {
        val parkingRecords = mutableMapOf<String, ArrayList<Pair<String, String>>>()
        val timeRecords = mutableMapOf<String, Int>()
        records.toSet().map {
            val carNumber = it.split(" ")[1]
            parkingRecords[carNumber] = arrayListOf()
            timeRecords[carNumber] = 0
        }

        val answer: IntArray = IntArray(parkingRecords.size) { 0 }

        records.map {
            val split = it.split(" ")
            parkingRecords[split[1]]?.add(split[0] to split[2])
        }

        parkingRecords.map { parkings ->
            var totalTime = 0
            var isCarIn = false

            parkings.value.mapIndexed { index, pair ->
                if (pair.second == "IN") {
                    isCarIn = true
                } else {
                    totalTime += getTimeDiff(parkings.value[index - 1].first, pair.first).toInt()
                    isCarIn = false
                }
            }

            if (isCarIn) {
                totalTime += getTimeDiff(parkings.value.last().first, "23:59").toInt()
            }

            timeRecords[parkings.key] = totalTime
        }

        val basicTime = fees[0]
        val basicFee = fees[1]
        val unitTime = fees[2]
        val unitFee = fees[3]

        val sortedRecords = timeRecords.toSortedMap()
        var index = 0
        sortedRecords.map {
            var totalFee = basicFee

            if (it.value > basicTime) {
                totalFee += ceil(((it.value - basicTime) / unitTime.toDouble())).toInt() * unitFee
            }

            answer[index] = totalFee
            index++
        }

        return answer
    }

//    val result = solution(
//        intArrayOf(180, 5000, 10, 600),
//        arrayOf(
//            "05:34 5961 IN",
//            "06:00 0000 IN",
//            "06:34 0000 OUT",
//            "07:59 5961 OUT",
//            "07:59 0148 IN",
//            "18:59 0000 IN",
//            "19:09 0148 OUT",
//            "22:59 5961 IN",
//            "23:00 5961 OUT"
//        )
//    )
    val result = solution(
        intArrayOf(1, 461, 1, 10),
        arrayOf(
            "00:00 1234 IN"
        )
    )
    println(result.toList())
}