import junitparams.JUnitParamsRunner
import junitparams.Parameters
import org.junit.Test
import org.junit.runner.RunWith
import kotlin.test.assertEquals

@RunWith(JUnitParamsRunner::class)
class MarsRoverTest {

    @Test
    @Parameters("5,5,N,5,6", "5,5,E,6,5", "5,5,S,5,4", "5,5,W,4,5")
    fun roverMovesOneForward(startX: Int, startY: Int, direction: Char, endX: Int, endY: Int) {
        val rover = MarsRover(direction, startX, startY)

        rover.forward()

        assertEquals(endX, rover.x)
        assertEquals(endY, rover.y)
    }

    @Test
    fun roverMovesOneBackward() {

    }
}