package algorithm.programmers.level_2

fun main() {

    data class Command(
        val type: String,
        val uid: String,
        val nickName: String
    )

    fun String.asCommand() = run {
        val items = this.split(" ")

        Command(
            items[0], items[1], items.getOrNull(2) ?: ""
        )
    }

    fun solution(record: Array<String>): Array<String> {
        val answer = mutableListOf<String>()
        val hashMap = hashMapOf<String, String>()

        record.map {
            val command = it.asCommand()

            when (command.type) {
                "Enter", "Change" -> hashMap[command.uid] = command.nickName
            }
        }

        record.map {
            val command = it.asCommand()

            when (command.type) {
                "Enter" -> answer.add("${hashMap[command.uid]}님이 들어왔습니다.")
                "Leave" -> answer.add("${hashMap[command.uid]}님이 나갔습니다.")
                else -> false
            }
        }

        return answer.toTypedArray()
    }

    val result = solution(
        arrayOf(
            "Enter uid1234 Muzi",
            "Enter uid4567 Prodo",
            "Leave uid1234",
            "Enter uid1234 Prodo",
            "Change uid4567 Ryan"
        )
    )
    println(result.toList())
}