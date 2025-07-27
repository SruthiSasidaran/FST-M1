package Activity;

public class Activity6 {
    public static void main(String[] args) {
        // Create a Plane object with maxPassengers set to 10
        Plane plane = new Plane(10);

        // Add passengers on the list
        plane.onboard("Alice");
        plane.onboard("Bob");
        plane.onboard("Charlie");
        plane.onboard("David");
        plane.onboard("Eve");

        // Print take-off time
        System.out.println("Take-off time: " + plane.takeOff());

        // Print list of passengers
        System.out.println("Passengers onboard: " + plane.getPassengers());

        // Pause execution for 5 seconds to emulate flight
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Flight interrupted!");
        }

        // Land the plane
        plane.land();

        // Print landing time
        System.out.println("Landing time: " + plane.getLastTimeLanded());
    }
}
