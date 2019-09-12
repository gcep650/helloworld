package HelloWorld;


public class MyArrayList
{
    int m_elements[];
    int m_count;
    int m_capacity;
    public MyArrayList()
    {
        m_count = 0;
        m_capacity = 5;
        m_elements = new int[m_capacity];
    }

    public boolean add(int e)
    {
        if (m_count == m_capacity)
        {
            int newArray[] = new int[2 * m_capacity];
            for (int i = 0; i < m_count; i++)
            {
                newArray[i] = m_elements[i];
            }
            m_elements = newArray;
            m_capacity = m_elements.length;
        }
        m_elements[m_count++] = e;
        return true;
    }

    public String toString()
    {
        String retval = "{";
        for (int i = 0; i < m_count; i++)
        {
            retval += m_elements[i];
            if (i < m_count - 1)
                retval += ",";
        }
        retval += "}";
        return retval;
    }

    public static void main(String[] args)
    {
        MyArrayList m = new MyArrayList();
        m.add(1);
        m.add(2);
        m.add(3);
        m.add(4);
        m.add(5);
        m.add(6);
        m.remove(2);
        System.out.println(m);
        System.out.println(m.get(3));
        
    }

    public void clear()
    {
        m_count = 0;
    }

    public int get(int index)
    {
        if (index >= 0 && index < m_count)
        {
            return m_elements[index];
        }
        return -1;
    }

    public boolean isEmpty()
    {
        return m_count == 0;
    }
    
    public int indexOf(int o)
    {
        for (int i = 0; i < m_count; i++)
        {
            if (m_elements[i] == o)
            {
                return i;
            }
        }
        return -1;
    }
    
    public boolean contains(int o)
    {
        for (int i = 0; i < m_count; i++)
        {
            if (m_elements[i] == o)
            {
                return true;
            }
        }
        return false;
    }
    
    public void remove(int item)
    {
        if (contains(item))
        {
            for (int i = indexOf(item); i < m_count; i++)
            {
                m_elements[i] = m_elements[i+1];
            }
            m_count--;
        }
    }
}
