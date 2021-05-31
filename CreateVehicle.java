/**
 * This program creates a Truck and a Bike instance using inheritance.
 *
 * @author  Marlon Poddalgoda
 * @version 1.0
 * @since 2021-05-28
 */

public final class CreateVehicle {
    private CreateVehicle() {

        // Throw an exception if this ever *is* called
        throw new AssertionError("Instantiating utility class.");
    }

    /**
    * This method creates instances of a truck and a bike.
    * @param args
    */
    public static void main(final String[] args) {
        // main stub, creates truck and bike

        // basic info
        System.out.println("This program creates a truck and "
                            + "a bike instance.");
        System.out.println();

        try {
            // try statement

            // constants
            // license number
            final String licenseInput = "TRUCK-123";
            // speed of truck
            final int truckSpeed = 45;
            // amount of air
            final int airAmount = 20;
            // brake speed
            final int brakeTruck = 10;
            // bike colour
            final String setBikeColour = "Black";
            // speed of bike
            final int bikeSpeed = 20;
            // brake speed
            final int brakeBike = 2;

            // create new instances
            Truck truck = new Truck();
            Bike bike = new Bike();

            //TRUCK
            System.out.println("The truck is in use.");
            // change colour
            System.out.println();
            System.out.println("The license for the truck has been changed: "
                                + licenseInput);
            truck.setLicense(licenseInput);

            // print number of wheels
            System.out.println("The truck has "
                                + truck.getWheels() + " wheels.");

            // change speed
            System.out.println();
            System.out.println("The truck has accelerated by "
                                + truckSpeed + " km/h");
            System.out.println("The current speed of the truck is "
                                + truck.accelerate(truckSpeed) + " km/h");
            System.out.println();
            System.out.println("The truck adds " + airAmount + " PSI to the "
                                + "air brakes.");
            System.out.println("The current amount of pressurized air is "
                                + truck.provideAir(airAmount) + " PSI.");
            System.out.println();
            System.out.println("The truck tries to brake by "
                                + brakeTruck + " km/h");
            System.out.println("The current speed of the truck is "
                                + truck.brake(brakeTruck) + " km/h");

            //BIKE
            System.out.println();
            System.out.println();
            System.out.println("The bike is in use.");
            System.out.println();
            // change colour method
            System.out.println("The colour for the bike has been changed to: "
                                + setBikeColour);
            bike.setColour(setBikeColour);

            // print number of wheels
            System.out.println("The bike has "
                                + bike.getWheels() + " wheels.");

            // change speed
            System.out.println();
            System.out.println("The bike has accelerated by "
                                + bikeSpeed + " km/h");
            System.out.println("The current speed of the bike is "
                                + bike.accelerate(bikeSpeed) + " km/h");
            System.out.println("The current cadence of the bike is "
                                + bike.calcCadence() + " rpm.");
            System.out.println();
            System.out.println("The bike rings the bell.");
            bike.ringBell();
            System.out.println();
            System.out.println("The bike tries to brake by "
                                + brakeBike + " km/h");
            System.out.println("The current speed of the bike is "
                                + bike.brake(brakeBike) + " km/h");

            // Done
            System.out.println();
            System.out.println("Done.");

        } catch (Exception e) {
            System.out.println("Invalid input, please try again!");
        }
    }
}
