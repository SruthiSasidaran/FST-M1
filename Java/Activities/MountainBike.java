package Activity;

	// Derived class MountainBike
	public class MountainBike extends Bicycle {
	    private int seatHeight;

	    // Constructor using super to initialize gears and currentSpeed
	    public MountainBike(int gears, int currentSpeed, int seatHeight) {
	        super(gears, currentSpeed);
	        this.seatHeight = seatHeight;
	    }

	    // Method to set a new seat height
	    public void setHeight(int newHeight) {
	        seatHeight = newHeight;
	        System.out.println("Seat height set to: " + seatHeight);
	    }

	    // Overriding the bicycleDesc() method
	    @Override
	    public void bicycleDesc() {
	        super.bicycleDesc(); // Call the superclass method
	        System.out.println("Seat height: " + seatHeight);
	    }
	}


