package com.company.Decorator;

import com.company.Room.*;

public class FoodServiceDecorator extends RoomDecorator {
    public FoodServiceDecorator(Room newRoom) {
        super(newRoom);
        System.out.println("Adding Special Food Service");
    }

    public String getRoomDescription() {
        return tempRoom.getRoomDescription() + "\n-> Additional Special Food Service";
    }

    public double getCost() {
        System.out.println("Cost of Special Food Service: " + 50.0);
        return tempRoom.getCost() + 50.0;
    }

    public String getRoomType() {
        return tempRoom.getRoomType();
    }

}