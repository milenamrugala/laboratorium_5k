fun add(a: Int, b: Int): Int {
    return a + b
}

fun add(a: Double, b: Double): Double {
    return a + b
}

fun main() {
    println(add(1, 2))
    println(add(1.0, 2.0))
    println(Fraction(1, 2).add(Fraction(3, 4)))
    // println(1, 2.0) - nie zostanie wywołana
}
