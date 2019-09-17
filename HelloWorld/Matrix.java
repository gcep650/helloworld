package HelloWorld;

public class Matrix
{
    private int m_matrix[];
    
    public Matrix(int e1, int e2, int e3, int e4)
    {
        m_matrix = new int[4];
        m_matrix[0] = e1;
        m_matrix[1] = e2;
        m_matrix[2] = e3;
        m_matrix[3] = e4;
    }
    
    public int Element(int index)
    {
        if (index >= 0 && index <= 3) { return m_matrix[index];}
        return -1;
    }
    
    public Matrix Add(Matrix other)
    {
        int e1 = other.Element(0) + Element(0);
        int e2 = other.Element(1) + Element(1);
        int e3 = other.Element(2) + Element(2);
        int e4 = other.Element(3) + Element(3);
        return new Matrix(e1, e2, e3, e4);
    }
    
    public Matrix ScalarMultiply(int factor)
    {
        int e1 = Element(0) * factor;
        int e2 = Element(1) * factor;
        int e3 = Element(2) * factor;
        int e4 = Element(3) * factor;
        return new Matrix(e1, e2, e3, e4);
    }
    
    public int Det()
    {
        return Element(0) * Element(3) - Element(1) * Element(2);
    }
    
    public String toString()
    {
        String top = String.format("%1$2d %2$2d", Element(0), Element(1));
        String bottom = String.format("%1$2d %2$2d", Element(2), Element(3));
        return String.format("|%1$s|\n|%2$s|", top, bottom); 
    }
    
    public static void main(String[] args)
    {
        Matrix m1 = new Matrix(1, 2, 3, 4);
        Matrix m2 = new Matrix(2, 4, 1, -1);
        System.out.println(m1.Add(m2));
        System.out.println(m1.ScalarMultiply(3));
        System.out.println(m1.Det());
    }
}
