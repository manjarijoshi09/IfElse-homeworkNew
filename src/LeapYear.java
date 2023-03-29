import java.util.Scanner;

public class LeapYear {

    //main method of java class from where the execution starts
    public static void main(String[] args) {
        int yr;

        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter the year you want to check");

        yr = scanner.nextInt();
        scanner.close();
        boolean LeapYear = false;

        //Checking the first and foremost condition of leap year
        if (yr % 4 == 0) {
            //Checking the second condition of the century year (as we skip a leap year after every 100 years)

            if (yr % 400 == 0) {//Checking the third condition of the century year (as we skip a leap year after every 100 years)
                if (yr % 100 == 0)

                    LeapYear = true;
            } else
                LeapYear = true;
        }
// all other years are not leap years
// Final checking the value of boolean variable ‘isLeapYear’ and displaying the final results on the console
        if(LeapYear == true)
            System.out.println("Given Year is a Leap Year");
        else
            System.out.println("Given year is not a Leap Year");

    }
}
