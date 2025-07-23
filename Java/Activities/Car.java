package Activity;

public class Car {

//Variables
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    // Constructor
    public Car(String color, String transmission, int make, int tyres, int doors) {
    	this.color = color;
    	this.transmission = transmission;
    	this.make = make;
        this.tyres = 4;
        this.doors = 4;
    }

    // Method to display characteristics
    public void displayCharacteristics() {
        System.out.println(this.color);
        System.out.println(this.transmission);
        System.out.println(this.make);
        System.out.println(this.tyres);
        System.out.println(this.doors);
    }

    // Method to simulate acceleration
    public void accelarate() {
        System.out.println("Car is moving forward.");
    }

	

    // Method to simulate braking
    public void brake() {
		// TODO Auto-generated method stub
		
        System.out.println("Car has stopped.");
    }
}


