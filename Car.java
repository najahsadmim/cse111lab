
public class Car extends Vehicle {

    public String model;
    public int doors;
    public boolean autoPilot;

    public Car(String brand, String model, int year, int doors, int wheels, boolean autoPilot) {
        super(brand, year);
        super.setWheels(wheels);
        this.model = model;
        this.doors = doors;
        this.autoPilot = autoPilot;
    }

    public void startAutoPilot() {
        if (this.autoPilot) {
            System.out.println(getBrand() + ": " + model + " AutoPilot Started");
        } else {
            System.out.println(getBrand() + ": " + model + " has NO AutoPilot Started");
        }
    }

    public String toString() {
        return "Car " + super.toString() + ", Model: " + this.model + ", Doors: " + this.doors + ", AI: " + this.autoPilot;
    }
}
