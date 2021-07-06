package algorithm.easy

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val dx = intArrayOf(-1, 1, 0, 0)
    val dy = intArrayOf(0, 0, -1, 1)

    var graph = ArrayList<ArrayList<Int>>()

    graph = arrayListOf(
        arrayListOf(1, 0, 1, 0, 1, 0),
        arrayListOf(1, 1, 1, 1, 1, 1),
        arrayListOf(0, 0, 0, 0, 0, 1),
        arrayListOf(1, 1, 1, 1, 1, 1),
        arrayListOf(1, 1, 1, 1, 1, 1),
    )

    val n = graph.size
    val m = graph[0].size

    fun bfs(x: Int, y: Int): Int {
        val queue: Queue<Pair<Int, Int>> = LinkedList()
        queue.offer(Pair(x, y))
        // 큐가 빌 때까지 반복
        while (queue.isNotEmpty()) {
            // 큐에서 하나의 원소 뽑아 출력
            val item = queue.poll()
            // 현재 위치에서 4가지 방향으로의 위치 확인
            for (i in 0 until 4) {
                val nx = item.first + dx[i]
                val ny = item.second + dy[i]
                // 미로 찾기 공간을 벗어난 경우 무시
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue
                // 벽인 경우 무시
                if (graph[nx][ny] == 0) continue
                // 해당 노드를 처음 방문하는 경우에만 최단 거리 기록
                if (graph[nx][ny] == 1) {
                    graph[nx][ny] = graph[item.first][item.second] + 1
                    queue.offer(Pair(nx, ny))
                }
            }
        }
        // 가장 오른쪽 아래까지의 최단 거리 반환
        return graph[n - 1][m - 1]
    }

    // 모든 노드(위치)에 대하여 음료수 채우기
    val result = bfs(0, 0)

    println(result)
}