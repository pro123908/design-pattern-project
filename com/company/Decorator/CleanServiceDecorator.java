package com.company.Decorator;

import com.company.Room.*;

public class CleanServiceDecorator extends RoomDecorator {
    public CleanServiceDecorator(Room newRoom) {
        super(newRoom);
        System.out.println("Adding Special cleaning Service");
    }

    public String getRoomDescription() {
        return tempRoom.getRoomDescription() + "\n-> Additional Special Cleaning Service";
    }

    public double getCost() {
        System.out.println("Cost of Special cleaning Service: " + 30.0);
        return tempRoom.getCost() + 30.0;
    }

    public String getRoomType() {
        return tempRoom.getRoomType();
    }

}