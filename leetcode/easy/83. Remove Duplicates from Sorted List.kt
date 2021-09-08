package algorithm.leetcode.easy

fun main() {

    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head == null) return null

        var prev = head
        var node = head

        while (node != null) {
            val next = node.next

            if (prev?.`val` != next?.`val`) {
                prev?.next = next
                prev = next
            } else {
                prev?.next = null
            }

            node = next
        }

        return head
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}