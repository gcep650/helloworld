package HelloWorld;
import java.util.Scanner;

public class StringTest
{
    public static void main(String[] args)
    {
        WetPants w1 = new WetPants(7);
        WetPants w2 = new WetPants(7);
        /*
        String s1 = "lard";
        Scanner s = new Scanner(System.in);
        String s2 = s.nextLine();

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        s1 = s2;
        System.out.println(s1 == s2);
         */
        System.out.println(w1 == w2);
        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w1.equals(w2));

    }
}
