import java.util.Scanner;

public class WeekdaysName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number 1 to 7");

        int a = scanner.nextInt();
        //use if-else statement
        if (a == 1) {
            System.out.println("today is monday");

        } else if (a == 2) {
            System.out.println("today is tuesday");


        } else if (a == 3) {
            System.out.println("today is wednesday");

        } else if (a == 4) {
            System.out.println("today is thursday");

        } else if (a == 5) {
            System.out.println("today is friday");

        } else if (a == 6) {
            System.out.println("today is saturday");
        }
    }
}


