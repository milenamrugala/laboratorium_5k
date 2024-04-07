fun main() {
    // laboratorium_1
    val firstPoint = Point(Math.random(), Math.random())
    val secondPoint = Point(Math.random(), Math.random())
    val thirdPoint = Point(Math.random(), Math.random())

    println("Współrzędne: $firstPoint")
    println("Współrzędne: $secondPoint")
    println("Współrzędne: $thirdPoint")

    val dx = Math.random()
    val dy = Math.random()

    firstPoint.move(dx, dy)
    secondPoint.move(dx, dy)
    thirdPoint.move(dx, dy)

    println("Przesunięcie: ($dx, $dy)")
    println("Współrzędne po przesunięciu: $firstPoint")
    println("Współrzędne po przesunięciu: $secondPoint")
    println("Współrzędne po przesunięciu: $thirdPoint")

    println()
    //laboratorium_5
    val fourthPoint = Point()
    println("Współrzędne: $fourthPoint")

    val fifthPoint = Point(y = 10.0, x = 12.0)
    println("Współrzędne: $fifthPoint")
}