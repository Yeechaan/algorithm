package algorithm.leetcode.sorting

fun main() {
    fun isAnagram(s: String, t: String): Boolean {
        val hashmap = hashMapOf<Char, Int>()

        if (s.length != t.length)
            return false

        s.forEach {
            if (hashmap.containsKey(it))
                hashmap[it] = hashmap[it]!! + 1
            else
                hashmap[it] = 1
        }

        t.forEach {
            if (hashmap.containsKey(it)) {
                hashmap[it] = hashmap[it]!! - 1
                if (hashmap[it] == 0)
                    hashmap.remove(it)
            }
        }

        return hashmap.isEmpty()
    }

//    val result = isAnagram("anagram", "nagaram")
    val result = isAnagram("a", "ab")
    println(result)
}