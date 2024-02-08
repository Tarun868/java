package functionalInterfaces;
import org.junit.Test;

import functionalInterfaces.Swap;
public class SwapTest {
    @Test
    public void testSwapIntegers() {
       


        Swap.swapIntegers( 4 ,5);
        System.out.println("\n");
        Swap.swapIntegers(-4,-5);
        System.out.println("\n");
        Swap.swapIntegers(45,54);
        System.out.println("\n");
        Swap.swapIntegers(-4,5);
        System.out.println("\n");
        Swap.swapIntegers(4,-5);
    }
}
