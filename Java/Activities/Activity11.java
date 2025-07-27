package Activity;

import java.util.HashMap;
import java.util.Map;
public class Activity11 {

	public class ColourMapExample {
	    public static void main(String[] args) {
	        // Create a Map with Integer keys and String values
	        Map<Integer, String> colours = new HashMap<>();

	        // Add 5 random colours
	        colours.put(1, "Red");
	        colours.put(2, "Blue");
	        colours.put(3, "Green");
	        colours.put(4, "Yellow");
	        colours.put(5, "Purple");

	        // Print the Map
	        System.out.println("Initial Map: " + colours);

	        // Remove one color
	        colours.remove(4); // Removes "Yellow"

	        // Check if "Green" exists
	        boolean hasGreen = colours.containsValue("Green");
	        System.out.println("Contains 'Green'? " + hasGreen);

	        // Print the size of the Map
	        System.out.println("Size of the Map: " + colours.size());
	    }
	}

}
