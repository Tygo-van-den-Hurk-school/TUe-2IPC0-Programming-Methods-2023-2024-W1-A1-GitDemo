/**
 * A Counter object keeps track of an integer count,
 * that can be inspected, incremented by one, and
 * reset to zero. The initial value is zero.
 *
 *
 * @author Tom Verhoeff (TU/e)
 */
public class Counter {

    private long value = 0;
    
    /**
     * Get the current count.
     */
    public long getCount() {
        return (this.value);
    }

    /**
     * Increment the count by one.
     */
    public void increment() {
        this.value++;
    }

    /**
     * Reset the count to zero.
     */
    public void reset() {
        this.value = 0;
    }
}