import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MainTest {

    @Test
    void testGetGreetingReturnsExpectedMessage() {
        assertEquals("Hello, World!", Main.getGreeting());
    }

    @Test
    void testGetGreetingIsNotEmpty() {
        assertFalse(Main.getGreeting().isEmpty());
    }
}
