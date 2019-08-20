package HelloWorld;
import java.util.Scanner;

public class Fraction
{
    int m_num;
    int m_denom;

    public Fraction(int num, int denom)
    {

        m_num = num / euclid(num, denom);
        m_denom = denom / euclid(num, denom);
    }

    public Fraction(int num)
    {
        m_num = num;
        m_denom = 1;
    }

    public Fraction recip()
    {
        return new Fraction(m_denom, m_num);
    }

    public Fraction add(Fraction other)
    {
        return new Fraction(
            m_num * other.m_denom + m_denom * other.m_num,
            m_denom * other.m_denom);
    }

    public Fraction subtract(Fraction other)
    {
        return new Fraction(
            m_num * other.m_denom - m_denom * other.m_num,
            m_denom * other.m_denom);
    }

    public Fraction multiply(Fraction other)
    {
        return new Fraction(m_num * other.m_num, m_denom * other.m_denom);
    }

    public Fraction divide(Fraction other)
    {
        return multiply(other.recip());
    }

    public String toString()
    {
        return m_num + "/" + m_denom;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Type in the numerator of the first fraction");
        int num1 = in.nextInt();
        System.out.println("Type in the denominator of the first fraction");
        int denom1 = in.nextInt();
        System.out.println("Type in the numerator of the second fraction");
        int num2 = in.nextInt();
        System.out.println("Type in the denominator of the second fraction");
        int denom2 = in.nextInt();
        Fraction f1 = new Fraction(num1, denom1);
        Fraction f2 = new Fraction(num2,denom2);
        System.out.println(f1.add(f2));
    }

    public int euclid(int x, int y) {
        if (x == 0 || y == 0) {
            return 1;
        }
        if (x < y) {
            int t = x;
            x = y;
            y = t;
        }
        if (x % y == 0) {
            return y;
        } else {
            return euclid(y, x % y);
        }
    }
}
