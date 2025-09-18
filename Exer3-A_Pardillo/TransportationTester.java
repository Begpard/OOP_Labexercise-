public class TransportationTester {
    public static void main(String[] args) {
        System.out.println("=== Transportation Tester ===\n");
        
        // Create instances of each subclass
        Airplane airplane = new Airplane("Boeing 747", 900, 416, 13100, "Jet", 4, 68.5);
        Helicopter helicopter = new Helicopter("Sikorsky UH-60", 278, 11, 5790, "Turboshaft", 2, true);
        
        Truck truck = new Truck("Volvo FH16", 120, 3, 18, "Diesel", 25000.0, true);
        SUV suv = new SUV("Toyota Land Cruiser", 180, 8, 4, "Gasoline", true, 3);
        Tricycle tricycle = new Tricycle("Local Tricycle", 30, 4, true, "Standard");
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", 180, 2, "Gasoline", "Cruiser", false);
        Kariton kariton = new Kariton("Wooden Cart", 2, "Wood", false);
        
        Ship ship = new Ship("Ever Given", 37, 20000, 220000, "Diesel", 7, "Container Ship");
        Boat boat = new Boat("Speedboat", 80, 6, 2.5, "Outboard Motor", "Motorboat", true);
        
        // Display information about each transportation
        System.out.println("AIR TRANSPORTATION:");
        System.out.println(airplane);
        System.out.println(helicopter);
        System.out.println();
        
        System.out.println("LAND TRANSPORTATION:");
        System.out.println(truck);
        System.out.println(suv);
        System.out.println(tricycle);
        System.out.println(motorcycle);
        System.out.println(kariton);
        System.out.println();
        
        System.out.println("WATER TRANSPORTATION:");
        System.out.println(ship);
        System.out.println(boat);
        System.out.println();
        
        // Demonstrate some methods
        System.out.println("DEMONSTRATING METHODS:");
        airplane.takeOff();
        helicopter.hover();
        truck.loadCargo();
        suv.engageFourWheelDrive();
        tricycle.ringBell();
        motorcycle.doWheelie();
        kariton.push();
        ship.soundHorn();
        boat.row();
        
        // Test getters and setters
        System.out.println("\nTESTING GETTERS AND SETTERS:");
        airplane.setMaxSpeed(950);
        System.out.println("Updated airplane speed: " + airplane.getMaxSpeed() + " km/h");
        
        truck.setCargoCapacity(30000.0);
        System.out.println("Updated truck capacity: " + truck.getCargoCapacity() + " kg");
        
        boat.setHasMotor(false);
        System.out.println("Boat motor status: " + (boat.hasMotor() ? "Has motor" : "No motor"));
    }
}
