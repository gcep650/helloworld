package HelloWorld;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CounterTest.
 *
 * @author  Gabriel Cepleanu
 * @version 1.0
 */
public class CounterTest
{
    /**
     * Default constructor for test class CounterTest
     */
    public CounterTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testReset()
    {
        Counter c = new Counter();
        c.increment();
        c.reset();
        assertEquals(c.getValue(), 0);
    }
    private int m_max = 100;
    private int m_min = -100;
    @Test
    public void testIncrement()
    {
        Counter c = new Counter();

        for (int i = 0; i < m_max; i++)
        {
            c.increment();
        }
        assertEquals(c.getValue(), m_max);
    }

    @Test
    public void testDecrement()
    {
        Counter c = new Counter();

        for (int i = 0; i > m_min; i--)
        {
            c.decrement();
        }
        assertEquals(c.getValue(), m_min);
    }
    
    @Test
    public void testGetValue()
    {
        Counter c = new Counter();
        assertEquals(c.getValue(), 0);
    }
}
