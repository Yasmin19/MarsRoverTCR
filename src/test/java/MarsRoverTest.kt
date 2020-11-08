import org.junit.Test

class MarsRoverTest {

    @Test
    fun roverMovesOneForward() {
        val rover = MarsRover()
        assertThat(expectedX, rover.getX())
    }
}