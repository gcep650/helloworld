package HelloWorld;
import java.util.Scanner;

public class StringsPractice
{

    public static void main(String[] args)
    {
        System.out.println("accomplishment".substring(2, 4));
        String s;
        String temp = "";
        String longest = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        s = in.nextLine();
        String[] words = s.split(" ");
        int tempx = 0;
        int length = 0;
        while (tempx > -1)
        {
            tempx = s.indexOf(" ");
            if (tempx > 0) {temp = s.substring(0, tempx);}
            else {temp = s;}
            int templ = temp.length();
            if (templ > length) {length = templ; longest = temp;}
            s = s.substring(tempx + 1);
        }
        System.out.println("Number of words: " + words.length);
        System.out.println("The longest word: " + longest);
    }
}
