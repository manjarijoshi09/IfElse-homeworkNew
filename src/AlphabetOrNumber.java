
import java.util.Scanner;
 public class AlphabetOrNumber
    {
        //write a programme to input a character and to print weather given character is an alphabet or digit or any character;

        public static void main(String[]args)
        {
            Scanner sc = new Scanner(System.in);
            char ch;
            System.out.println("enter a character");
            //variable ch
            ch=sc.next().charAt(0);//7
            System.out.println(ch>='a'&&ch<='z'?"Capital alphabet":ch>='0'&&ch<='9'?"digit":"symbol");



        }
    }






