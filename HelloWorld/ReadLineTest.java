package HelloWorld;
import java.util.Scanner;

public class ReadLineTest
{

    public static void main(String[] args)
    {
         Scanner in = new Scanner(System.in);
         
         String s = in.nextLine();
         System.out.println("You typed: " + s);
         
         int i = in.nextInt();
         System.out.println("Number you typed: " + i);
    }

}
