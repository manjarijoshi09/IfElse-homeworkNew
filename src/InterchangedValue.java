import java.util.Scanner;

public class InterchangedValue {
    //to find out interchanging value of two numbers

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //interchanging bw a & b
        int a,b,c;
        System.out.println("enter value of a & b");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("before interchanging number:" + a +"" + b);
        //interchanging value

        c= a;
        a = b;
        b = c;
        System.out.println("after interchanging number:" + a +" " + b);
    }
}
