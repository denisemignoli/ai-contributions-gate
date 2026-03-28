import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void getMessage_returnsHelloWorld() {
        assertEquals("Hello, World!", Main.getMessage());
    }

    @Test
    void main_runsWithoutThrowingException() {
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
}
