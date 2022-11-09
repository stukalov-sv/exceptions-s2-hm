public class Task2HM {
    public static void main(String[] args) {
        // try {
        //     int d = 0;
        //     double catchedRes1 = intArray[8] / d;
        //     System.out.println("catchedRes1 = " + catchedRes1);
        //  } catch (ArithmeticException e) {
        //     System.out.println("Catching exception: " + e);
        //  }

        int[] intArray = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        try {
            int d = 0;
            int catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }   
    }
}
