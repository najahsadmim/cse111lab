
public class Garage {

    public Car[] cars;
    public Bike[] bikes;
    public int carCap;
    public int bikeCap;
    public int carCount = 0;
    public int bikeCount = 0;

    public Garage(int carCap, int bikeCap) {
        this.carCap = carCap;
        this.bikeCap = bikeCap;
        cars = new Car[carCap];
        bikes = new Bike[bikeCap];
        System.out.println("Welcome to the Garage!");
        System.out.println("Car Capacity: " + carCap);
        System.out.println("Bike Capacity: " + bikeCap);
    }

    public void addVehicle(Vehicle v) {
        if (v instanceof Car) {
            if (carCount < carCap) {
                cars[carCount] = (Car) v;
                carCount++;
                System.out.println("A " + v.getBrand() + " CAR has been added to the Garage");
            } else {
                System.out.println("Can't add more Cars! Capacity: " + carCap);
            }
        } 
        else if (v instanceof Bike){
            if (bikeCount < bikeCap) {
                bikes[bikeCount] = (Bike) v;
                bikeCount++;
                System.out.println("A " + v.getBrand() + " BIKE has been added to the Garage");
            } else {
                System.out.println("Can't add more Bikes! Capacity: " + bikeCap);
            }
        }
    }
}
