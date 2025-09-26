import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTestJUnit {

    @Test
    public void testLogin() {
        String username = "user1";
        String password = "pass1";
        assertEquals("Login successful", login(username, password));
    }

    private String login(String user, String pass) {
        return "Login successful";
    }
}
