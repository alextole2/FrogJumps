import java.math.RoundingMode

private val entries = arrayOf(
    Triple(0, 85, 30),
    Triple(5, 105, 3)
)

private fun solution(X: Int, Y: Int, D: Int): Int {
    return (Y - X).toBigDecimal().divide(D.toBigDecimal(), RoundingMode.UP).toInt()
}

private fun printlnSolution(entry: Triple<Int, Int, Int>) {
    println("$entry -> ${solution(entry.first, entry.second, entry.third)}")
}

fun main() {
    entries.forEach { printlnSolution(it) }
}
