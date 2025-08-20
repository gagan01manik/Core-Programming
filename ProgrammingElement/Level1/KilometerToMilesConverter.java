//package ProgrammingElement.Level1Practice;


class KilometerToMilesConverter {
    public static void main(String[] args) {

        double distanceKm = 10.8;
        double conversionRate = 1.6;

      
        double distanceMiles = distanceKm / conversionRate;

        
        System.out.println("The distance " + distanceKm + " km in miles is " + distanceMiles);
    }
}

