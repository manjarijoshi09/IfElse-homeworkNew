import java.util.Scanner;

public class Eligibility {
    Scanner scanner = new Scanner(System.in);

    public void eligibleForVote()

    { //acknowledge the user what to enter

        System.out.println("Please enter your age in inter value");

        //storing age in variable using scanner object

        int age =scanner.nextInt();
        if (age>=18)
        {

            System.out.println("you are eligible for vote as your age is: "+age);

        }else {
            System.out.println("You are not eligible for vote as your age is: "+age);

        }
    }

    public static void main(String[] args) {

        //creating class object to call not-static method in static area
        Eligibility eligibleForVote = new Eligibility();

        //calling method using class object
        eligibleForVote.eligibleForVote();


    }

}
