package Activity;


	import java.util.ArrayList;
	import java.util.Random;
	import java.util.Scanner;
	
	public class Activity13 {

	public class RandomScannerActivity {
	    public static void main(String[] args) {
	        // Create required objects
	        Scanner scan = new Scanner(System.in);
	        ArrayList<Integer> list = new ArrayList<>();
	        Random indexGen = new Random();

	        System.out.println("Enter integer values (non-integer to stop):");

	        // Accept only integer inputs
	        while (scan.hasNextInt()) {
	            int number = scan.nextInt();
	            list.add(number);
	        }

	        // Convert ArrayList to array
	        Integer[] nums = list.toArray(new Integer[0]);

	        // Generate random index and print value
	        if (nums.length > 0) {
	            int randomIndex = indexGen.nextInt(nums.length);
	            System.out.println("Random index generated: " + randomIndex);
	            System.out.println("Value at that index: " + nums[randomIndex]);
	        } else {
	            System.out.println("No integers were entered.");
	        }

	        scan.close();
	    }
	}

}
