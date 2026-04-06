public abstract class Vehicle {
    // Instance variables
    private double maxSpeed;
    protected double currentSpeed;

    // Constructor
    public Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0.0; // Defaulting to 0 initially
    }

    // Abstract method
    public abstract void accelerate();

    // Accessor methods
    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    // Method to repeatedly call accelerate
    public void pedalToTheMetal() {
        while (currentSpeed < maxSpeed) {
            accelerate();
        }
    }
}