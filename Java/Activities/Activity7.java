package Activity;

public class Activity7 {
	
	    public static void main(String[] args) {
	        // Create a MountainBike object
	        MountainBike myBike = new MountainBike(5, 20, 10);

	        // Display initial description
	        System.out.println("Initial Bicycle Description:");
	        myBike.bicycleDesc();

	        // Speed up the bike
	        myBike.speedUp(15);

	        // Apply brake
	        myBike.applyBrake(10);

	        // Change seat height
	        myBike.setHeight(12);

	        // Display updated description
	        System.out.println("\nUpdated Bicycle Description:");
	        myBike.bicycleDesc();
	    }
	}


