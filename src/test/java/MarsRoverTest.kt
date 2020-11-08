import org.junit.Test
import kotlin.test.assertEquals

class MarsRoverTest {

    @Test
    fun roverMovesOneForward() {
        val rover = MarsRover()
        val expectedX = 5

        rover.forward()

        assertEquals(expectedX, rover.x())
    }
}