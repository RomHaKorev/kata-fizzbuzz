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

    val multiple_of_3 = IntRange(0, 100).filter { it % 3 == 0 && it % 5 != 0 }
    val multiple_of_5 = IntRange(0, 100).filter { it % 3 != 0 && it % 5 == 0 }
    val multiple_of_3_and_5 = IntRange(0, 100).filter { it % 3 == 0 && it % 5 == 0 }
    val not_multiple_of_3_and_5 = IntRange(0, 100).filter { it % 3 != 0 && it % 5 != 0 }

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


    @Test
    @DisplayName("Should display the number for any value that does not respect any rule")
    fun test5() {
        for (x in not_multiple_of_3_and_5)
            entering number x should_display x.toString()
    }

    @Test
    @DisplayName("Should display 'fizz' for any multiple of 3")
    fun test6() {
        for (x in multiple_of_3)
            entering number x should_display "fizz"
    }

    @Test
    @DisplayName("Should display 'buzz' for any a multiple of 5")
    fun test7() {
        for (x in multiple_of_5)
        entering number x should_display "buzz"
    }

    @Test
    @DisplayName("Should display 'fizzbuzz' for any multiple of 3 and 5")
    fun test8() {
        for (x in multiple_of_3_and_5)
        entering number x should_display "fizzbuzz"
    }

    private val entering = FizzbuzzTestHelper()
}


