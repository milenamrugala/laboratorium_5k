fun main()  {
    //laboratorium_1
    val lines = arrayOf(
        Line(0, 0, 600, 0), //AB
        Line(600, 0, 600, 300), //BC
        Line(600, 300, 300, 600), //CE
        Line(300, 600, 0, 300), //ED
        Line(0, 300, 0, 0), //DA
        Line(0, 0, 600, 300), //AC
        Line(600, 300, 0, 300), //CD
        Line(0, 300, 600, 0) //DB
    )

    for ((index, line) in lines.withIndex()) {
        println("Line no ${index + 1}: $line")
    }

    println()
    //laboratorium_5
    val secondLine = Line(0,0,6,8)
    println("Start: $secondLine")
    val lineLength = secondLine.length()
    println("Length: $lineLength")

}