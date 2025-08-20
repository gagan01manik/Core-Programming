import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double baseInCm = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightInCm = input.nextDouble();

        double areaInSqCm = 0.5 * baseInCm * heightInCm;

        double areaInSqIn = areaInSqCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle is " + areaInSqIn + " sq in and " + areaInSqCm + " sq cm");

        input.close();
    }
}
