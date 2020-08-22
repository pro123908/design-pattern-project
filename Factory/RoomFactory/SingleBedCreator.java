package Factory.RoomFactory;

import Room.*;

public class SingleBedCreator extends RoomCreator {

    @Override
    public Room createRoom() {
        return new SingleBedRoom();
    }

}