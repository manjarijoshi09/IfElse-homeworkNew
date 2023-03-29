import java.util.Scanner;

public class CityName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a letter from A TO F: ");
        char letter = scanner.next().charAt(0);
        //use if-else substance
        if (letter == 'A') {
            System.out.println("Aurangabad");
        } else if (letter == 'B') {
            System.out.println("Bilasnagar");
        } else if (letter == 'c') {
            System.out.println("Chennai");
        } else if (letter == 'd') {
            System.out.println("deheradun");
        } else if (letter == 'f') {
            System.out.println("faridabad");
        } else {
            System.out.println("invalid entry");

        }

    }

}