package strings;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class StringrotationTest {

    @Test
    public void testIsRotation() {
        // Test case 1: Rotated string
        assertTrue(Stringrotation.isRotation("JavaJ2eeStrutsHibernate", "StrutsHibernateJavaJ2ee"));

        // Test case 2: Not a rotated string
        assertFalse(Stringrotation.isRotation("HelloWorld", "WorldHello"));

        // Test case 3: Empty strings
        assertFalse(Stringrotation.isRotation("", ""));

        // Test case 4: Unequal lengths
        assertFalse(Stringrotation.isRotation("abc", "abcd"));

        // Test case 5: Null strings
        assertFalse(Stringrotation.isRotation(null, "test"));

        // Test case 6: Null strings
        assertFalse(Stringrotation.isRotation("test",null));
}
}
