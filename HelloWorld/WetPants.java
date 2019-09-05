package HelloWorld;

public class WetPants
{
    int m_pantsness;

    public WetPants(int pants)
    {
        m_pantsness = pants;
    }

    public boolean equals(Object other)
    {
        if (other instanceof WetPants)
        {
            return ((WetPants)other).m_pantsness == m_pantsness;
        }
        return false;
    }
}
