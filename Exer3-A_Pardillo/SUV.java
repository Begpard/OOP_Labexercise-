public class SUV extends LandTransport {
    private boolean isFourWheelDrive;
    private int seatingRows;
    
    public SUV() {
        super();
        this.isFourWheelDrive = true;
        this.seatingRows = 3;
    }
    
    public SUV(String name, int maxSpeed, int capacity, int numberOfWheels, 
              String fuelType, boolean isFourWheelDrive, int seatingRows) {
        super(name, maxSpeed, capacity, numberOfWheels, fuelType);
        this.isFourWheelDrive = isFourWheelDrive;
        this.seatingRows = seatingRows;
    }
    
    public void engageFourWheelDrive() {
        if (isFourWheelDrive) {
            System.out.println(getName() + " is engaging four-wheel drive.");
        } else {
            System.out.println(getName() + " doesn't have four-wheel drive.");
        }
    }
    
    // Getters and setters
    public boolean isFourWheelDrive() {
        return isFourWheelDrive;
    }
    
    public void setFourWheelDrive(boolean isFourWheelDrive) {
        this.isFourWheelDrive = isFourWheelDrive;
    }
    
    public int getSeatingRows() {
        return seatingRows;
    }
    
    public void setSeatingRows(int seatingRows) {
        this.seatingRows = seatingRows;
    }
    
    @Override
    public String toString() {
        return "SUV - " + super.toString() + ", 4WD: " + (isFourWheelDrive ? "Yes" : "No") + 
               ", Seating Rows: " + seatingRows;
    }
}
