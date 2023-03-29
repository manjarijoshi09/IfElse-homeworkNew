import java.util.Scanner;
//to check number is positive or negative
public class PositiveNegativeNumber {
    Scanner scanner= new Scanner(System.in);

    public void PositiveNegativeNumber(){

        int number=scanner.nextInt();
        if (number>0){
            System.out.println(number+"is a positive number");
        } else if (number<0) {
            System.out.println(number+"is a negative number");

        } else {
            System.out.println(number+"is a zero number");

        }
    }
    public static void main(String[] args) {
        //to call non static to static
        PositiveNegativeNumber positiveNegativeNumber = new PositiveNegativeNumber();
        //calling method
        positiveNegativeNumber.PositiveNegativeNumber();
    }}