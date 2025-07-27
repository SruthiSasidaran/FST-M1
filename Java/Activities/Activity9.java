package Activity;

import java.util.ArrayList;
	public class Activity9 {

//How to do Array
	    public static void main(String[] args) {
	        // Create an ArrayList of Strings
	        ArrayList<String> myList = new ArrayList<>();

	        // Add 5 names to the ArrayList
	        myList.add("Alice");
	        myList.add("Bob");
	        myList.add("Charlie");
	        myList.add("Diana");
	        myList.add("Ethan");

	        // Print all names using a for loop
	        System.out.println("All names in the list:");
	        for (int i = 0; i < myList.size(); i++) {
	            System.out.println(myList.get(i));
	        }

	        // Retrieve the 3rd name (index 2)
	        String thirdName = myList.get(2);
	        System.out.println("\nThe 3rd name in the list is: " + thirdName);

	        // Check if a name exists in the list
	        String nameToCheck = "Diana";
	        boolean exists = myList.contains(nameToCheck);
	        System.out.println("\nDoes the list contain '" + nameToCheck + "'? " + exists);

	        // Print the number of names in the list
	        System.out.println("\nNumber of names in the list: " + myList.size());

	        // Remove a name and print the new size
	        myList.remove("Bob");
	        System.out.println("\nAfter removing 'Bob', number of names in the list: " + myList.size());
	    
	}
}



