package HelloWorld;

public class Counter
{
    private int m_count;
    
    public void increment() {m_count++;}
    public void decrement() {m_count--;}
    public int getValue() {return m_count % 100;}
    public void reset() {m_count = 0;}
}
