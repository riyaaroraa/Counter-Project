/**
 * A counter that stops counting everytime the maximum count is reached.
 * 
 * @author Riya Arora (101190033)
 * @version June 8, 2022
 * 
 */
public class LimitedCounter extends Counter
{
    
    /**
     * Constructs a new LimitedCounter whose current count is
     * initialized to DEFAULT_MINIMUM, and which counts between
     * DEFAULT_MINIMUM and DEFAULT_MAXIMUM, inclusive which are set in the 
     * super class, Counter.
     */
    public LimitedCounter()
    {
        super();
    }

    /**
     * Constructs a new LimitedCounter whose current count is
     * initialized to minCount, and which counts between
     * minCount and maxCount, inclusive.
     * 
     * @param minCount The minimum limit of the counter
     * @param maxCount The maximum limit of the counter
     * 
     */
    public LimitedCounter(int minCount, int maxCount)
    {
        super(minCount, maxCount);
    }

    
    /**
     * Increment this counter by 1. If we've reached the maximum count, invoking this 
     * method doesn't change the state of the counter.
     */
    public void countUp()
    {
        if (!isAtMaximum()) {
            incrementCount();
        }
    }
}
