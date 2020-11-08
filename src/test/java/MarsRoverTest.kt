import junitparams.JUnitParamsRunner
import junitparams.Parameters
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals

@RunWith(JUnitParamsRunner::class)
class MarsRoverTest {

    @Test
    @Parameters("5,5,N,5,6", "5,5,E,6,5")
    fun roverMovesOneForward(direction: Char, startX: Int, startY: Int, endX: Int, endY: Int) {
        val rover = MarsRover(direction, startX, startY)

        rover.forward()

        assertEquals(endX, rover.x)
        assertEquals(endY, rover.y)
    }
}