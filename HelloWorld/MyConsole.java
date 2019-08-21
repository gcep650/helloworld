package HelloWorld;
import java.util.Scanner;

public class MyConsole
{
    public static int readInt(String prompt)
    {
        System.out.println(prompt);
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    
    public static double readDouble(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(prompt);
        return in.nextDouble();
    }
    
    public static boolean readBoolean(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(prompt);
        return in.nextBoolean();
    }
    
    public static String readLine(String prompt)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(prompt);
        return in.nextLine();
    }
    
    public static void main(String[] args)
    {
        /*
        int x = readInt("Please type in an int: ");
        System.out.println(x);
        double d = readDouble("Type in a double: ");
        System.out.println(d);
        boolean b = readBoolean("Type in true or false: ");
        System.out.println(b);
        String s = readLine("Type in a string: ");
        System.out.println(s);
        */
       double x = 5.3;
       int y = (int)x;
       
    }
}
