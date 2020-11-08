import junitparams.Parameters
import org.junit.Test
import kotlin.test.assertEquals

class MarsRoverTest {

    @Test
    @Parameters("5,5,N,5,6", "5,5,E,6,5", "5,5,S,5,4")
    fun roverMovesOneForward(direction: Char, startX: Int, startY: Int, endX: Int, endY: Int) {
        val rover = MarsRover(direction, startX, startY)

        rover.forward()

        assertEquals(endX, rover.x)
        assertEquals(endY, rover.y)
    }
}