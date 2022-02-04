package algorithm.programmers.level_3

fun main() {

    fun dfs(node: Int, computers: Array<IntArray>, visited: Array<Boolean>) {
        visited[node] = true

        for (i in 0 until computers[node].size) {
            val nextNode = computers[node][i]

            if (i != node && nextNode == 1 && !visited[i])
                dfs(i, computers, visited)
        }
    }

    fun solution(n: Int, computers: Array<IntArray>): Int {
        var answer = 0

        val visited = Array(n) { false }

        visited.mapIndexed { index, isVisited ->
            if (!isVisited) {
                answer++
                dfs(index, computers, visited)
            }
        }

        return answer
    }


    val list = arrayOf(intArrayOf(1, 1, 0), intArrayOf(1, 1, 0), intArrayOf(0, 0, 1))
//    val list = arrayOf(intArrayOf(1, 1, 0), intArrayOf(1, 1, 1), intArrayOf(0, 1, 1))

    val result = solution(3, list)
    println(result)
}