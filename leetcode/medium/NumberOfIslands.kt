package algorithm.leetcode.medium

fun main() {

    fun dfs(grid: Array<CharArray>, x: Int, y: Int): Boolean {
        if ((y !in 0 until grid[0].size) || (x !in grid.indices))
            return false

        if (grid[x][y] == '1') {
            grid[x][y] = '0'

            dfs(grid, x - 1, y)
            dfs(grid, x, y - 1)
            dfs(grid, x + 1, y)
            dfs(grid, x, y + 1)
            return true
        }

        return false
    }

    fun numIslands(grid: Array<CharArray>): Int {
        var answer = 0

        for (i in grid.indices) {
            for (j in 0 until grid[i].size) {
                if (dfs(grid, i, j)) {
                    answer++
                }
            }
        }

        return answer
    }

    val result = numIslands(
        arrayOf(
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('0', '0', '1', '0', '0'),
            charArrayOf('0', '0', '0', '1', '1')
        )
    )

    println(result)

}