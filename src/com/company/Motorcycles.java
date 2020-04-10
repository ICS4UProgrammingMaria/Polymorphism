package com.company;

public class Motorcycles extends Main
{

    Integer mileage;

    @Override
    public String list()
    {
        String s = super.list();
        s += String.format("Mileage: %d\n", mileage);
        return s;
    }

    Motorcycles(String licensePlate, String colour, Integer mileage)
    {
        super(licensePlate, colour,0, 30, 50);
        this.mileage = mileage;
        System.out.println("Motorcycle:\n" + list());
    }
}
