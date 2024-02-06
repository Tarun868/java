package lambdas;
import org.junit.Test;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class AlphabeticalTest {
    @Test
    public void testCapitalizeAndSort() {
        Alphabetical x = new Alphabetical();
        String[] inputArray = {"banana", "apple", "Cherry"};
        String[] expected = {"Apple", "Banana", "Cherry"};
        String[] result = x.capitalizeAndSort(inputArray);
        assertArrayEquals(expected, result);
    }
}
