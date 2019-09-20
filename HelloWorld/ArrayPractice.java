package HelloWorld;
public class ArrayPractice
{
    private int scores[];
    private int m_grades[][];
    
    public ArrayPractice(int rows, int columns)
    {
        scores = new int[5];
        m_grades = new int[rows][columns];
        for (int i = 0; i < scores.length; i++)
        {
            scores[i] = i;
        }
        for (int i = 0; i < m_grades.length; i++)
        {
            for (int j = 0; j < m_grades[i].length; j++)
            {
                m_grades[i][j] = i * 3 + (j+1);
            }
        }
    }
    public String toString()
    {
        String retval = "";
        /*
        for (int[] g: m_grades)
        {
            retval += "(";
            for (int f: g)
            {
                retval += f + ",";
            }
            retval += ")\n";
        }
        */
        for (int r = 0; r < m_grades.length; r++)
        {
            retval += "(";
            for (int c = 0; c < m_grades[r].length; c++)
            {
                retval += m_grades[r][c] + ",";
            }
            retval += ")\n";
        }
        return retval;
    }
    
    public static void main(String[] args)
    {
        ArrayPractice a1 = new ArrayPractice(2, 3);
        System.out.println(a1);
    }
}
