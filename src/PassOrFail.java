import java.util.Scanner;

public class PassOrFail {

    //student pass if gets more than 35 marks

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        byte maths, eng, science;
        float avg;
        System.out.println("enter maths marks");
        maths = input.nextByte();
        System.out.println("enter english marks");
        eng = input.nextByte();
        System.out.println("enter science marks");
        science = input.nextByte();
        avg = (maths + eng + science) / 3.0f;
        System.out.println("your overall percentage" + "is" + avg);

        if(avg >= 35 && maths >= 35 && eng >= 35 && science>= 35){
            System.out.println("pass");
        }
        else {
            System.out.println("fail");

    }}}
