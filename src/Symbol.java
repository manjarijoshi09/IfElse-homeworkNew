
import java.util.Scanner;

public class Symbol {

        //BOdy of the main function of the program.
        public static void main(String[] args)
        {
            //Declaring the required variables for the program.
            int m, n, opt, add, sub, mul;
            double div;
            //Creating the object of the scanner class for taking the input
            Scanner s = new Scanner(System.in);
            //Taking the input two numbers from the user.
            //Taking the input first numbers from the user.
            System.out.print("Enter first number:");
            m = s.nextInt();
            //Taking the input second numbers from the user.
            System.out.print("Enter second number:");
            n = s.nextInt();
            //Performing the addtion of the two numbers.
            add = m + n;
            //Printing the Sum of two numbers.
            System.out.println("Result:"+add);
            //Performing the subtraction of the two numbers.
            sub = m - n;
            //Printing the Difference of two numbers.
            System.out.println("Result:"+sub);
            //Performing the multiplication of the two numbers.
            mul = m * n;
            //Printing the Multiplication of two numbers.
            System.out.println("Result:"+mul);
            //Performing the division of the two numbers.
            div = (double)m / n;
            //Printing the Division of two numbers.
            System.out.println("Result:"+div);
        }
    }

