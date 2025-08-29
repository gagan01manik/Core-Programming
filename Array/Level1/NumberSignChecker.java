import java.util.Scanner;

class NumberSignChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        // Taking 5 inputs
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Checking conditions
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0)
                    System.out.println(numbers[i] + " is a positive even number.");
                else
                    System.out.println(numbers[i] + " is a positive odd number.");
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is a negative number.");
            } else {
                System.out.println(numbers[i] + " is zero.");
            }
        }

        // Comparing first and last element
        if (numbers[0] > numbers[4])
            System.out.println("First element is greater than last.");
        else if (numbers[0] < numbers[4])
            System.out.println("First element is less than last.");
        else
            System.out.println("First and last elements are equal.");

        input.close();
    }
}
