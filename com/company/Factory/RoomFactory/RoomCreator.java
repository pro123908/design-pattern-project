package com.company.Factory.RoomFactory;

import com.company.Room.*;

public abstract class RoomCreator {

    public Room getRoom() {
        Room room = createRoom();
        return room;
    }

    public abstract Room createRoom();

}