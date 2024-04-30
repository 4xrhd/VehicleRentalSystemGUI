package vehiclerentalsystemgui;

public class Vehicle {
     protected String brand;
    protected String model;
    protected int year;
    protected double dailyRate;
    protected boolean available;

    // Constructor
    Vehicle(String brand, String model, int year, double dailyRate) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.dailyRate = dailyRate;
        this.available = true; // By default, the vehicle is available
    }

    // Method to display vehicle details
    public void display() {
        System.out.println("\nBrand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Daily Rental Rate: $" + dailyRate);
        System.out.println("Availability: " + (available ? "Available" : "Not Available"));
    }

    // Method to rent the vehicle
    public void rent() {
        available = false;
    }

    // Method to return the vehicle
    public void returnVehicle() {
        available = true;
    }     
}
