package Activity;


	// Base class implementing both interfaces
	public class Bicycle implements BicycleParts, BicycleOperations {
	    private int gears;
	    private int currentSpeed;

	    // Constructor to initialize gears and currentSpeed
	    public Bicycle(int gears, int currentSpeed) {
	        this.gears = gears;
	        this.currentSpeed = currentSpeed;
	    }

	    // Method to apply brake
	    public void applyBrake(int decrement) {
	        currentSpeed -= decrement;
	        if (currentSpeed < 0) {
	            currentSpeed = 0;
	        }
	        System.out.println("Brake applied. Current speed: " + currentSpeed);
	    }

	    // Method to speed up
	    public void speedUp(int increment) {
	        currentSpeed += increment;
	        System.out.println("Sped up. Current speed: " + currentSpeed);
	    }

	    // Method to describe the bicycle
	    public void bicycleDesc() {
	        System.out.println("Number of gears: " + gears);
	        System.out.println("Current speed: " + currentSpeed);
	    }
	}
