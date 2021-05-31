/**
 * This is the class file is for the Bike Class.
 *
 * @author  Marlon Poddalgoda
 * @version 1.0
 * @since 2021-05-28
 */

public class Bike extends Vehicle {
    // Class for bike

    // fields
    /**
    * Cadence (rpm).
    */
    private double cadence;
    /**
    * Number of wheels.
    */
    private final int numOfWheels = 2;
    /**
    * Constant for calculating cadence.
    */
    private final double cadenceConst1 = 25;
    /**
    * Constant for calculating cadence.
    */
    private final double cadenceConst2 = 3;
    /**
    * Constant for calculating cadence.
    */
    private final double cadenceConst3 = 0.305;

    // constructor
    /**
    * This contructor creates a base bike.
    */
    public Bike() {
        super();
        this.cadence = 0;
    }

    // getters
    /**
    * This getter returns the number of wheels.
    * @return numOfWheels This is the number of wheels.
    */
    public int getWheels() {
        return numOfWheels;
    }

    // methods
    /**
    * This method calculates the bike cadence.
    * @return cadenceInt This is the candece.
    */
    public int calcCadence() {
        // converts km/h into rpm for a standard 24 inch bike wheel
        // formula derived from online

        this.cadence = (cadenceConst1 / (cadenceConst2 * Math.PI
                        * cadenceConst3) * getSpeed()) / 2;
        int cadenceInt = (int) cadence;
        return cadenceInt;
    }

    /**
    * This method rings the bell.
    */
    public void ringBell() {
        // prints out to the console
        System.out.println("Ding!");
    }
}
