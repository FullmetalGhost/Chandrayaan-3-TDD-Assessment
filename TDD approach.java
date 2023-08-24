import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpacecraftTest {

    @Test
    public void testMoveForwardNorth() {
        // Test moving forward in the North direction
        // Assert that the new position is as expected
    }

    @Test
    public void testRotateLeft() {
        // Test rotating left from the North direction
        // Assert that the new direction is as expected
    }

    // Add more test methods for other commands and scenarios
}
public class Spacecraft {
    // Implement the Spacecraft class as previously shown
}
@Test
public void testMoveForwardNorth() {
    Spacecraft spacecraft = new Spacecraft(0, 0, 0, "N");
    spacecraft.move('f');
    assertEquals(0, spacecraft.getX());
    assertEquals(1, spacecraft.getY());
    assertEquals(0, spacecraft.getZ());
}