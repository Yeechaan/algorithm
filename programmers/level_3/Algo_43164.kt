package algorithm.programmers.level_3

fun main() {

    lateinit var visited: MutableList<Boolean>
    lateinit var sortedTickets: List<Array<String>>
    val answer = mutableListOf<String>()
    val temp = mutableListOf<String>()

    fun dfs(departure: String, size: Int): Boolean {
        temp.add(departure)

        if (size == sortedTickets.size) {
            answer.addAll(temp)
            return true
        }

        for (i in sortedTickets.indices) {
            if (sortedTickets[i][0] == departure && !visited[i]) {
                visited[i] = true
                if (dfs(sortedTickets[i][1], size + 1)) return true
                visited[i] = false
            }
        }

        temp.removeAt(temp.size-1)
        return false
    }

    fun solution(tickets: Array<Array<String>>): Array<String> {

        visited = MutableList(tickets.size) { false }
        sortedTickets = tickets.sortedBy { it[1] }

        dfs("ICN", 0)

        return answer.toTypedArray()
    }


//    val result = solution(arrayOf(arrayOf("ICN", "JFK"), arrayOf("HND", "IAD"), arrayOf("JFK", "HND")))
    //[["ICN", "SFO"], ["ICN", "ATL"], ["SFO", "ATL"], ["ATL", "ICN"], ["ATL","SFO"]]
    val result = solution(
        arrayOf(
            arrayOf("ICN", "SFO"),
            arrayOf("ICN", "ATL"),
            arrayOf("SFO", "ATL"),
            arrayOf("ATL", "ICN"),
            arrayOf("ATL", "SFO")
        )
    )

    println(result.toList())
}