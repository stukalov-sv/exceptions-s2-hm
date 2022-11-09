import java.util.Scanner;

public class Task1HM {
    public static void main(String[] args) {
        tryPrintDouble();
    }

    public static void tryPrintDouble() {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter double:");
            double result = scan.nextDouble();
            System.out.printf("Your double: %f", result);
            
        } catch (Exception e) {
            System.out.println("Incorrect data. Try again abd enter double");
            tryPrintDouble();
        }
        scan.close();
    }
}