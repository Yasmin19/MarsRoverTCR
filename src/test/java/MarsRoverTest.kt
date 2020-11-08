import org.junit.Test
import kotlin.test.assertEquals

class MarsRoverTest {

    @Test
    fun roverMovesOneForward() {
        val rover = MarsRover(direction = 'N', startX = 5, startY = 5)

        rover.forward()

        assertEquals(5, rover.x)
        assertEquals(6, rover.y)
    }

    @Test
    fun roverMovesOneEast() {
        val rover = MarsRover(direction = 'E', startX = 5, startY = 5)

        rover.forward()

        assertEquals(6, rover.x)
        assertEquals(5, rover.y)
    }
}