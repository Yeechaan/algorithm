package algorithm.programmers.level_3

fun main() {

    lateinit var visited: Array<Boolean>
    var answer = 0
    lateinit var _words: List<String>
    lateinit var _targer: String

    fun isOneAlphabetDifferent(x: String, y: String) = run {
        var count = 0

        for (i in x.indices) {
            if (x[i] != y[i])
                count++

            if (count > 1)
                return@run false
        }

        true
    }

    fun dfs(word: String, count: Int): Boolean {

        if (_words.contains(word)) {
            val index = _words.indexOf(word)
            visited[index] = true
        }

        if (count == _words.size || word == _targer) {
            answer = count
            return true
        }

        var tempIndex = 0
        for (i in _words.indices) {

            if (isOneAlphabetDifferent(word, _words[i])) {
                tempIndex = i

                if (_words[i] == _targer)
                    dfs(_words[i], count + 1)
            }
        }

        if (!visited[tempIndex]) {
            if (dfs(_words[tempIndex], count + 1)) return true
        }

        return false
    }

    fun solution(begin: String, target: String, words: Array<String>): Int {
        visited = Array(words.size) { false }
        _targer = target
        _words = words.toList()

        dfs(begin, 0)

        return answer
    }

    val result = solution("hit", "cog", arrayOf("hot", "dot", "dog", "lot", "log", "cog"))
    println(result)
}