
//to calculate gross salary
import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {

        double hra;
        double DA;
        double TA;
        double PF;
        double basicSalary=25000;
        double gp;
         double NP;
        System.out.println("enter your basic salary");
        Scanner scanner=new Scanner(System.in);
        double bp,da;
        System.out.println("enter basic pay");
        bp= scanner.nextInt();

    hra = (8.0 / 100) * bp;
        da=10.0/100*bp;
        TA=9.0/100*bp;
        PF=20.0/100*bp;
        gp=bp + da + TA + hra - PF;
        NP= gp-PF;


        System.out.println("gross pay:"+ gp);
        System.out.println("net pay:"+ NP);


    }
}