// laboratorium_3

class Fraction(
    private val numerator: Int,
    private val denominator: Int
) {

    fun add(a: Fraction): Fraction {
        val newNumerator = numerator * a.denominator + a.numerator * denominator
        val newDenominator = denominator * a.denominator
        return Fraction(newNumerator, newDenominator)
    }

    private fun gcd(a: Int, b: Int): Int {
        var firstNumber = a
        var secondNumber = b

        while (secondNumber != 0) {
            val temp = secondNumber
            secondNumber = firstNumber % secondNumber
            firstNumber = temp
        }
        return firstNumber
    }

    override fun toString(): String {
        val gcd = gcd(numerator, denominator)
        val newNumerator = numerator / gcd
        val newDenominator = denominator / gcd

        return if (newDenominator == 1) {
            "$newNumerator"
        } else {
            val whole = newNumerator / newDenominator
            val remainder = newNumerator % newDenominator

            if (whole != 0) {
                if (remainder != 0) {
                    "$whole $remainder/$newDenominator"
                } else {
                    "$whole"
                }
            } else {
                "$newNumerator/$newDenominator"
            }
        }
    }
}