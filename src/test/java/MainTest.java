import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.Main;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testMainExecution() {
        Main.main(new String[]{});
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
}
