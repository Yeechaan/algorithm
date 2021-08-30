package dfs_bfs

fun main() {

    val graph = arrayListOf(
        arrayListOf(0, 0, 1, 1, 0), // 1번 노드
        arrayListOf(0, 0, 0, 1, 1),
        arrayListOf(1, 1, 1, 1, 1),
        arrayListOf(0, 0, 0, 0, 0),
    )

    val height = graph.size
    val width = graph[0].size

    fun dfs(x: Int, y: Int): Boolean {

        if (x <= -1 || x >= height || y <= -1 || y >= width) {
            return false
        }

        if (graph[x][y] == 0) {
            graph[x][y] = 1

            dfs(x - 1, y)
            dfs(x, y - 1)
            dfs(x + 1, y)
            dfs(x, y + 1)

            return true
        } else {
            return false
        }
    }

    fun solution(): Int {
        var answer = 0

        for (i in 0 until height) {
            for (j in 0 until width) {
                if (dfs(i, j)) answer ++
            }
        }

        return answer
    }

    val result = solution()
    println(result)

}