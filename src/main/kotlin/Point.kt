class Point(
    private var x: Double = 0.0,
    private var y: Double = 0.0
) {

    override fun toString(): String {
        return "Point(x=$x, y=$y)"
    }

    fun move(dx: Double, dy: Double) {
        x += dx
        y += dy
    }

    fun getX(): Double {
        return x
    }

    fun getY(): Double {
        return y
    }

    fun setX(x: Double) {
        this.x = x
    }

    fun setY(y: Double) {
        this.y = y
    }
}


