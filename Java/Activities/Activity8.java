package Activity;

public class Activity8 {
	

	    // Method to test the exception
	    public static void exceptionTest(String value) throws CustomException {
	        if (value == null) {
	            throw new CustomException("Error: Provided string is null.");
	        } else {
	            System.out.println("String value: " + value);
	        }
	    }

	    // Main method to demonstrate usage
	    public static void main(String[] args) {
	        try {
	            exceptionTest("Hello, Sruthi!");  // Valid input
	            exceptionTest(null);              // Will throw CustomException
	        } catch (CustomException e) {
	            System.out.println("Caught CustomException: " + e.getMessage());
	        }
	    }
	}



