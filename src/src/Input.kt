class Input(private val value: Int) {
    init {
        if (value !in 0..100) {
            throw OutOfBoundsException(0, value, 100)
        }
    }

    infix fun is_multiple_of(i: Int): Boolean = this.value % i == 0

    override fun toString() = this.value.toString()
}

class OutOfBoundsException(min: Int, value: Int, max: Int) : Throwable("The value should be between $min and $max (actual is $value)")