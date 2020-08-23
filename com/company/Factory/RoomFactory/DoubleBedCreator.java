package com.company.Factory.RoomFactory;

import com.company.Room.*;

public class DoubleBedCreator extends RoomCreator {

    @Override
    public Room createRoom() {

        return new DoubleBedRoom();
    }

}