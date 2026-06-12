package src.JavaPrograms;

public class LargestNumberinArray {
    public static void main(String[] args) {
//
//
                int[] arr = {10, 20, 30, 40, 50};
                int largest = arr[0];

                for (int num : arr) {
                    if (num > largest) largest = num;
                }

                System.out.println("Largest number: " + largest);

                try {
                    int result = 10 / 0;  // This will throw ArithmeticException
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Exception caught: " + e.getMessage());
                } finally {
                    System.out.println("Inside finally block");
                }
                System.out.println("Program continues...");




    }
}
