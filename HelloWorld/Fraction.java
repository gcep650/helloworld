package HelloWorld;

public class Fraction
{
    int m_num;
    int m_denom;
    
    public Fraction(int num, int denom)
    {
        m_num = num;
        m_denom = denom;
    }
    
    public Fraction add(Fraction other)
    {
        return null;
    }
    
    public Fraction multiply(Fraction other)
    {
        return new Fraction(m_num * other.m_num, m_denom * other.m_denom);
    }
    
    public String toString()
    {
        return m_num + "/" + m_denom;
    }
    
    public static void main(String[] args)
    {
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(3,4);
        System.out.println(f1.multiply(f2));
    }
}
