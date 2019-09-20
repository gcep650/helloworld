package HelloWorld;

public class M
{
    private int m_data[][];
    
    public M(int rows, int columns)
    {
        m_data = new int[rows][columns];
    }
    
    public M(int[][] data)
    {
        m_data = new int[data.length][data[0].length];
        for (int r = 0; r < data.length; r++)
        {
            for (int c = 0; c < data[0].length; c++)
            {
                m_data[r][c] = data[r][c];
            }
        }
    }
    
    public String toString()
    {
        String retval = "";
             for (int r = 0; r < m_data.length; r++)
        {
            retval += "| ";
            for (int c = 0; c < m_data[0].length; c++)
            {
                retval += m_data[r][c] + " ";
            }
            retval += "|\n";
        }   
        return retval;
    }
    
    public static void main(String[] args)
    {
        int[][] data = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] data2 = {{-1,-2,-3},{-4,-5,-6},{-7,-8,-9}};
        M m1 = new M(data);
        M m2 = new M(data2);
        System.out.println(m1.scalarMultiply(2));
    }
    
    public M Add(M other)
    {
        int[][] data = new int[m_data.length][m_data[0].length];
        for (int r = 0; r < m_data.length; r++)
        {
            for (int c = 0; c < m_data[0].length; c++)
            {
                data[r][c] = m_data[r][c] + other.m_data[r][c];
            }
        }
        return new M(data);
    }
    
    public M scalarMultiply(int scale)
    {
        int[][] data = new int[m_data.length][m_data[0].length];
        for (int r = 0; r < m_data.length; r++)
        {
            for (int c = 0; c < m_data[0].length; c++)
            {
                data[r][c] = m_data[r][c] * scale;
            }
        }
        return new M(data);
    }
}
