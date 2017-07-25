/*
Thomas Gwozdz
From class on July 25, 2017

This class represents a Car object.
*/

public class Car {

    // instance variables
    public String model;
    public String color;
    public int topSpeed;
    public int mileage;

    // constructor
    public Car(String model, String color, int topSpeed, int mileage) {
        this.model = model;
        this.color = color;
        this.topSpeed = topSpeed;
        this.mileage = mileage;
    }

    // add a trip
    public void addTrip(int km) {
        mileage += km; // update mileage to add the trip distance
    }

    // print the car
    public String toString() {
        return "Model:     " + model + "\n" +
               "Color:     " + color + "\n" +
               "Top speed: " + topSpeed + " km/hr\n" +
               "Mileage:   " + mileage + " km";
    }

    // main method
    public static void main(String[] args) {
        // create a new car called myCar
        Car myCar = new Car("Mercedes CLA", "White/Red/Black", 300, 16000);

        System.out.println(myCar);

        System.out.println("Adding a trip of 1,200 kms...");
        myCar.addTrip(1200);

        System.out.println(myCar);
    }
}





