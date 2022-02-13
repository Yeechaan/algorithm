package algorithm.programmers.level_2

import java.util.*
import kotlin.math.ceil

fun main() {

    data class FeeStandard(
        val basicTime: Int,
        val basicFee: Int,
        val unitTime: Int,
        val unitFee: Int
    )

    data class Record(
        val number: String,
        val time: String,
        val state: String
    )

    data class History(
        var totalFee: Int = 0,
        val records: MutableList<Record>
    )

    fun getTimeDiffAsMinutes(inTime: String, outTime: String) = run {
        val inTimeString = inTime.split(":")
        val outTimeString = outTime.split(":")

        val inTimeAsCalendar = Calendar.getInstance().apply {
            time = Date()
            set(Calendar.MINUTE, inTimeString[0].toInt())
            set(Calendar.SECOND, inTimeString[1].toInt())
        }
        val outTimeAsCalendar = Calendar.getInstance().apply {
            time = Date()
            set(Calendar.MINUTE, outTimeString[0].toInt())
            set(Calendar.SECOND, outTimeString[1].toInt())
        }

        (outTimeAsCalendar.timeInMillis - inTimeAsCalendar.timeInMillis) / 1000
    }

    fun getTotalFee(totalTime: Int, feeStandard: FeeStandard) = run {
        var totalFee = feeStandard.basicFee

        if (totalTime > feeStandard.basicTime) {
            val extraTime = (totalTime - feeStandard.basicTime).toDouble() / feeStandard.unitTime.toDouble()
            totalFee += (ceil(extraTime).toInt() * feeStandard.unitFee)
        }

        totalFee
    }

    fun solution(fees: IntArray, records: Array<String>): IntArray {
        val answer = mutableListOf<Int>()
        val historyMap = hashMapOf<String, History>()

        val feeStandard = FeeStandard(fees[0], fees[1], fees[2], fees[3])
        records.map {
            val recordString = it.split(" ")
            val record = Record(recordString[1], recordString[0], recordString[2])

            if (!historyMap.contains(record.number))
                historyMap[record.number] = History(records = mutableListOf(record))
            else
                historyMap[record.number]?.records?.add(record)
        }

        historyMap.map { history ->
            var totalTime = 0
            val historyRecords = history.value.records
            historyRecords.mapIndexed { index, record ->
                if (record.state == "OUT") {
                    val diffTime = getTimeDiffAsMinutes(historyRecords[index - 1].time, record.time)
                    totalTime += diffTime.toInt()
                }

                if (record.state == "IN" && index == historyRecords.size - 1) {
                    val diffTime = getTimeDiffAsMinutes(record.time, "23:59")
                    totalTime += diffTime.toInt()
                }
            }

            history.value.totalFee = getTotalFee(totalTime, feeStandard)
        }

        historyMap.toSortedMap().map {
            answer.add(it.value.totalFee)
        }

        return answer.toIntArray()
    }

    val result = solution(
        intArrayOf(180, 5000, 10, 600),
        arrayOf(
            "05:34 5961 IN",
            "06:00 0000 IN",
            "06:34 0000 OUT",
            "07:59 5961 OUT",
            "07:59 0148 IN",
            "18:59 0000 IN",
            "19:09 0148 OUT",
            "22:59 5961 IN",
            "23:00 5961 OUT"
        )
    )

    println(result.toList())
}