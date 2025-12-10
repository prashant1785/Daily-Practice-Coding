package assignment3;
//11. Create a class Vehicle with attributes brand and speed. Define a constructor to
//initialize these attributes.

    public class Que011
    {
        public static void main(String[] args)
        {
            Car car = new Car("Mahindra",165 ,9);
            car.display();
        }
    }
    class Vehicle
    {
        String brand;
        int speed;

    public Vehicle(String brand, int speed)
    {
        this.brand = brand;
        this.speed = speed;
    }
    }
class Car extends Vehicle {
    int seats;

    public Car(String brand, int speed, int seats) {
        super(brand, speed);
        this.seats = seats;
    }

    public void display()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Seats: " + seats);
    }
}







