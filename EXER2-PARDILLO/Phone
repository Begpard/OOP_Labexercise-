public class Phone {
    private String brand;
    private String model;
    private String imei;
    private String color;
    private int storageGB;

    public Phone() {
        this.brand = "Samsung";
        this.model = "Galaxy S23";
        this.imei = "IMEI123456789";
        this.color = "Black";
        this.storageGB = 128;
    }

    public Phone(String brand, String model, String imei, String color, int storageGB) {
        this.brand = brand;
        this.model = model;
        this.imei = imei;
        this.color = color;
        this.storageGB = storageGB;
    }

    public void displayInfo() {
        String info = "";
        info += "Brand: " + this.brand;
        info += "\nModel: " + this.model;
        info += "\nIMEI: " + this.imei;
        info += "\nColor: " + this.color;
        info += "\nStorage: " + this.storageGB + "GB";
        System.out.println(info);
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("Apple", "iPhone 15", "IMEI987654321", "Blue", 256);
        Phone phone2 = new Phone();

        System.out.println("Phone 1 Details:");
        phone1.displayInfo();
        
        System.out.println("\nPhone 2 Details:");
        phone2.displayInfo();
    }
}
