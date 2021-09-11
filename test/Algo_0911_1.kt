package algorithm.test

fun main() {

    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        val answer: IntArray = IntArray(id_list.size) { 0 }
        val reportedUsers = mutableMapOf<String, Int>()

        val userSummary = mutableMapOf<String, MutableSet<String>>()
        id_list.map {
            userSummary[it] = mutableSetOf()
            reportedUsers[it] = 0
        }

        report.map {
            val users = it.split(" ")

            if (userSummary[users[0]]?.contains(users[1]) != true) {
                reportedUsers[users[1]] = reportedUsers[users[1]]!! + 1
                userSummary[users[0]]?.add(users[1])
            }
        }

        val cancelledUsers = mutableListOf<String>()
        reportedUsers.map {
            if (it.value >= k) cancelledUsers.add(it.key)
        }

        var index = 0
        userSummary.map { user ->
            user.value.map {
                if (cancelledUsers.contains(it)) answer[index]++
            }
            index++
        }

        return answer
    }

    val result = solution(
        arrayOf("muzi", "frodo", "apeach", "neo"),
        arrayOf("muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"),
        2
    )

    println(result)
}