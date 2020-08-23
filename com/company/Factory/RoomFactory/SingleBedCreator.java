package com.company.Factory.RoomFactory;

import com.company.Room.*;

public class SingleBedCreator extends RoomCreator {

    @Override
    public Room createRoom() {
        return new SingleBedRoom();
    }

}