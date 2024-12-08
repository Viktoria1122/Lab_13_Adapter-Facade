import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.AuthorizationAdapter;
import ua.edu.ucu.apps.DatabaseAdapter;
import ua.edu.ucu.apps.Авторизація;
import ua.edu.ucu.apps.БазаДаних;

import static org.junit.jupiter.api.Assertions.*;

class AuthorizationTest {
    @Test
    void testAuthorize() {
        БазаДаних database = new БазаДаних();
        Авторизація authorization = new Авторизація();
        AuthorizationAdapter adapter = new AuthorizationAdapter(authorization);

        assertTrue(adapter.authorize(new DatabaseAdapter(database)), "Authorization should return true");
    }
}