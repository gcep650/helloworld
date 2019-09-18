package HelloWorld;
public class MultPractice
{
    private int m_first;
    private int m_second;
    
    public MultPractice(int first, int second)
    {
        m_first = first;
        m_second = second;
    }
    
    public String getProblem()
    {
        return m_first + " TIMES " + m_second;
    }
    
    public void nextProblem() { m_second++; }
    
    public static void main(String[] args)
    {
        MultPractice m1 = new MultPractice(1, 7);
        System.out.println(m1.getProblem());
        m1.nextProblem();
        m1.nextProblem();
        System.out.println(m1.getProblem());
    }
}
