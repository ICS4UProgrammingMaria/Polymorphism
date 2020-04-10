package com.company;

public class Main {

    public static void main(String[] args) {

        Main Electric = new ElectricCar("TESL AAA", "Grey", 140);

        Main Motorcycles = new Motorcycles("MOTO CYC", "Red", 60);
    }

    private String licensePlate;
    private String color;
    private int numDoors;
    private int speed;
    private int maxSpeed;

    Main(String licensePlate, String color, int numDoors, int speed, int maxSpeed) {
        this.licensePlate = licensePlate;
        this.color = color;
        this.numDoors = numDoors;
        this.speed = speed;
        this.maxSpeed = maxSpeed;

        //break point b4 each output group
        //System.out.println("Done");
    }

    public String list() {
        return String.format("License Plate: %s " +
                        "\nColour: %s " +
                        "\nNumber of doors: %d " +
                        "\nSpeed: %d " +
                        "\nMaxSpeed: %d\n",
                licensePlate, color, numDoors, speed, maxSpeed);
    }

}