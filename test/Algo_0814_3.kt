package algorithm.test

import test.toss0814.*

fun main() {

    fun solution(N: Int, M: Long): Long {
        var answer: Long = 0

        var foo: Foo = PlusOne()
        var tenMultiplier = TenMultiplier(foo)

        answer += sum(N, M, foo)
        answer += sum(N, M, tenMultiplier)

        foo = PlusTwo()
        tenMultiplier = TenMultiplier(foo)
        answer += sum(N, M, foo)
        answer += sum(N, M, tenMultiplier)

        foo = PlusThree()
        tenMultiplier = TenMultiplier(foo)
        answer += sum(N, M, foo)
        answer += sum(N, M, tenMultiplier)

        return answer
    }

    val result = solution(-1, 1)
    println(result)
}