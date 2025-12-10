package assignment3;

class Vehicle2
{
    private String make;
    private String model;
    private int year;
    private double price;

    public Vehicle2(String make, String model, int year, double price)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public void displayDetails()
    {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
    public double calculateInsurance()
    {
        return 0.02 * price * (2024 - year);
    }
}
class Car2 extends Vehicle2
{
    private int numDoors;
    private boolean hasSunroof;

    public Car2(String make, String model, int year, double price, int numDoors, boolean hasSunroof) {
        super(make, model, year, price);
        this.numDoors = numDoors;
        this.hasSunroof = hasSunroof;
    }
    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Has Sunroof: " + (hasSunroof ? "Yes" : "No"));
    }
    @Override
    public double calculateInsurance()
    {
        double baseInsurance = super.calculateInsurance();
        if (hasSunroof) {
            baseInsurance += 500;
        }
        return baseInsurance;
    }
}
class Truck extends Vehicle2
{
    private double cargoCapacity;
    private int numWheels;

    public Truck(String make, String model, int year, double price, double cargoCapacity, int numWheels) {
        super(make, model, year, price);
        this.cargoCapacity = cargoCapacity;
        this.numWheels = numWheels;
    }

    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Cargo Capacity: " + cargoCapacity + " kg");
        System.out.println("Number of Wheels: " + numWheels);
    }

    @Override
    public double calculateInsurance()
    {
        double baseInsurance = super.calculateInsurance();
        if (cargoCapacity > 5000) {
            baseInsurance += 800;
        }
        return baseInsurance;
    }
}
public class Que8
{
    public static void main(String[] args)
    {

        Car2 car = new Car2("Mahindra ", "S3", 2021, 25000, 5, false);
        System.out.println("Car Details:");
        car.displayDetails();
        System.out.println("Car Insurance: $" + car.calculateInsurance());
        System.out.println();


        Truck truck = new Truck("Ford", "F-150", 2018, 35000, 6000, 6);
        System.out.println("Truck Details:");
        truck.displayDetails();
        System.out.println("Truck Insurance: $" + truck.calculateInsurance());
    }
}
