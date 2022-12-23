fun main() {
    print(solution(17))
}

fun solution(n: Int): Int {
    for (i in 2 until n) {
        val factorial = factorial(i)
        if (factorial >= n) {
            return factorial
        }
    }

    return 1
}

fun factorial(n: Int): Int {
    if (n == 1)
        return 1

    return n * factorial(n - 1)
}