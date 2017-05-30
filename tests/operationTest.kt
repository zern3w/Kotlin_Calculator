import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.*
import org.junit.Test

/**
 * Created by puttipong on 5/30/17.
 */
class operationTest {

    val cal = operation(5.0, 10.0)

    @Test
    fun add() {
        val actual = cal.add()
        assertThat(15.0, equalTo(actual))
    }

    @Test
    fun minus() {
        val actual = cal.minus()
        assertThat(-5.0, equalTo(actual))
    }

    @Test
    fun multiply() {
        val actual = cal.multiply()
        assertThat(50.0, equalTo(actual))
    }

    @Test
    fun divide() {
        val actual = cal.divide()
        assertThat(0.5, equalTo(actual))
    }
}