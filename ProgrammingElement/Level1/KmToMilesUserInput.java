import java.util.Scanner;

class KmToMilesUserInput {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter distance in kilometers: ");
        double distanceKm = input.nextDouble();

        /
        double distanceMiles = distanceKm / 1.6;

       
        System.out.println("The total miles is " + distanceMiles + 
                           " mile for the given " + distanceKm + " km");

        
        input.close();
    }
}
