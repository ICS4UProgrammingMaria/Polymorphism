package com.company;

public class ElectricCar extends Main
{

    Integer mileage;

    @Override
    public String list()
    {
        String s = super.list();
        s += String.format("Mileage: %d\n", mileage);
        return s;
    }

    ElectricCar(String licensePlate, String colour, Integer mileage)
    {
        super(licensePlate, colour, 2, 30, 50);
        this.mileage = mileage;
        System.out.println("Electric car:\n" + list());
    }
}
