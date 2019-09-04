package HelloWorld;
import java.util.Scanner;

public class beep
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        s.nextLine();
        System.out.println("\007");
        //System.out.flush();
        s.nextLine();
    }
}
