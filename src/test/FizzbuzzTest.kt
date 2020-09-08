import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class FizzbuzzTestHelper {
    infix fun number(i: Int): String {
        val sut = Fizzbuzz(Input(i))
        return sut.evaluate()
    }
}

private infix fun String.should_display(expected: String) {
    Assertions.assertEquals(expected, this)
}

class FizzbuzzTest {

    @Test
    @DisplayName("Should display the number if value does not respect any rule")
    fun test1() {
        entering number 13 should_display "13"
    }

    @Test
    @DisplayName("Should display 'fizz' if value is a multiple of 3")
    fun test2() {
        entering number 9 should_display "fizz"
    }

    @Test
    @DisplayName("Should display 'buzz' if value is a multiple of 5")
    fun test3() {
        entering number 10 should_display "buzz"
    }

    @Test
    @DisplayName("Should display 'fizzbuzz' if value is a multiple of 3 and 5")
    fun test4() {
        entering number 15 should_display "fizzbuzz"
    }

    private val entering = FizzbuzzTestHelper()
}


