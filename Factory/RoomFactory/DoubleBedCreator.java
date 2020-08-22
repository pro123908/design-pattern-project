package Factory.RoomFactory;

import Room.*;

public class DoubleBedCreator extends RoomCreator {

    @Override
    public Room createRoom() {

        return new DoubleBedRoom();
    }

}