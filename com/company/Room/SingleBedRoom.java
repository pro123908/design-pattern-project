package com.company.Room;

public class SingleBedRoom implements Room {

    @Override
    public double getCost() {

        return 50.00;
    }

    @Override
    public String getRoomDescription() {

        return "Single Bed with ";
    }

    @Override
    public String getRoomType() {

        return "Single Bed";
    }

}