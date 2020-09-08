import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions
import java.util.*


class InputTest {
    @Test
    @DisplayName("Should create an input if value is between 0 and 100")
    fun test1() {
        for (x in 0..100) {
            Assertions.assertDoesNotThrow { Input(x) }
        }
    }

    @Test
    @DisplayName("Should raise an error if value is less than 0")
    fun test2() {
        val value = -1 - Random().nextInt()
        Assertions.assertThrows(OutOfBoundsException::class.java) { Input(value) }
    }

    @Test
    @DisplayName("Should raise an error if value is greater than 100")
    fun test3() {
        val value = 101 + Random().nextInt()
        Assertions.assertThrows(OutOfBoundsException::class.java) { Input(value) }
    }
}