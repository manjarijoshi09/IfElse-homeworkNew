import java.util.Scanner;

public class MarkSheet {

    Scanner scanner=new Scanner(System.in);

    //mark sheet of all the students

    //name of all the students
    String student_name;

    //subjects
    int English,maths,science;

    //marks
    int total_marks;

    int percentage;

    //roll number
    int roll_number;

    public void score() {
        System.out.println("enter your name:");
        student_name = scanner.nextLine();

        System.out.println("enter your roll number:");
        roll_number = scanner.nextInt();

        System.out.println("enter your english marks");
        int english = scanner.nextInt();

        System.out.println("enter your science marks");
        int science = scanner.nextInt();



        //total marks of all the subject

        int total = maths + english + science;





        float percentage = (total / 3);
        System.out.println("your total marks=" + (total));
        System.out.println("your percentage is" + percentage);
        System.out.println("grade=fail");

    }


    public static void main(String[] args) {
        MarkSheet markSheet = new MarkSheet();
        markSheet.score();




    }
}
