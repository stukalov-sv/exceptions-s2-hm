import java.util.Scanner;

public class Task4HM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result = null;
        System.out.println("Enter any string:");
        result = scan.nextLine();
        if (result.isEmpty()) {
            throw new IllegalArgumentException("Your string is empty");
        } else {
            System.out.println(result);
        }
        scan.close();
    }
}
