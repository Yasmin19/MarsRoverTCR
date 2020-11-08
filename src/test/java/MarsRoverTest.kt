import org.junit.Test
import kotlin.test.assertEquals

class MarsRoverTest {

    @Test
    fun roverMovesOneForward() {
        val direction = "N"
        val startX = 5
        val startY = 5
        val rover = MarsRover(direction, startX, startY)

        rover.forward()

        assertEquals(5, rover.x)
        assertEquals(6, rover.y)
    }
}