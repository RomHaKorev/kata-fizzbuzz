class Fizzbuzz(private val input: Input) {

    fun evaluate(): String {
        (input is_multiple_of 3 display "fizz") also
        (input is_multiple_of 5 display "buzz") otherwise
        { number() }

        return result
    }

    private fun number(): Boolean {
        result += input.toString()
        return true
    }

    private fun add(s: String): Boolean {
        result += s
        return true
    }

    private infix fun Boolean.display(s: String): Boolean {
        return this && add(s)
    }

    private infix fun Boolean.also(i: Boolean): Boolean {
        return this || i
    }

    private infix fun Boolean.otherwise(r: () -> Boolean): Boolean {
        return this || r()
    }

    var result: String = ""
}