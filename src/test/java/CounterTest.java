import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for class Counter.
 *
 * @author Tom Verhoeff (TU/e)
 */
public class CounterTest {

    /**
     * Test of getCount method, of class Counter.
     */
    @Test
    public void testGetCount() {
        System.out.println("getCount");
        Counter instance = new Counter();
        long expResult = 0L;
        long result = instance.getCount();
        assertEquals(expResult, result, "result");
    }

    /**
     * Test of increment method, of class Counter.
     */
    @Test
    public void testIncrement() {
        System.out.println("increment");
        Counter instance = new Counter();
        instance.increment();
        long expResult = 1L;
        long result = instance.getCount();
        assertEquals(expResult, result, "getCount");
    }

    /**
     * Test of reset method, of class Counter.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        Counter instance = new Counter();
        instance.increment();
        instance.reset();
        long expResult = 0L;
        long result = instance.getCount();
        assertEquals(expResult, result, "getCount");
    }
}