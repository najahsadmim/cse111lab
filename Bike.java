
public class Bike extends Vehicle {

    public String model;
    public boolean sideCar;

    public Bike(String brand, String model, int year, int wheels, boolean sideCar) {
        super(brand, year);
        super.setWheels(wheels);
        this.model = model;
        this.sideCar = sideCar;
    }

    public void doAWheelie() {
        if (this.sideCar) {
            System.out.println("Wheelie Failed. " + getBrand() + ": " + model + " has SideCar");
        } else {
            System.out.println(getBrand() + ": " + model + " is doing Wheelie!");
        }
    }

    public String toString() {
        return "Bike " + super.toString() + ", Model: " + this.model + ", SideCar: " + this.sideCar;
    }
}
