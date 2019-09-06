package HelloWorld;

public class Atom
{
    private int m_protons;
    private int m_neutrons;
    private int m_electrons;
    private String m_name;
    
    public Atom(int protons, int neutrons, int electrons, String name)
    {
        m_protons = protons;
        m_neutrons = neutrons;
        m_electrons = electrons;
        m_name = name;
    }
    
    public int Protons() {return m_protons;}
    public int Neutrons() {return m_neutrons;}
    public int Electrons() {return m_neutrons;}
    public String ElementName() {return m_name;}
    
    public int AtomicNumber() {return m_protons;}
    
    public int AtomicMass() {return m_protons + m_neutrons;}
    
    public String Charge()
    {
        int difference = m_protons - m_electrons;
        if (difference == 0) {return "neutral";}
        else if (difference > 0) {return "cation";}
        return "anion";
    }
    
    public String toString()
    {
        return "Element name: " + m_name + "\nAtomic number: " + AtomicNumber()
        + "\nAtomic mass: " + AtomicMass() + "\nCharge: " + Charge();
    }
    
    public static void main(String[] args)
    {
        Atom a = new Atom(10, 4, 9, "Windonium");
        System.out.println(a);
    }
}
