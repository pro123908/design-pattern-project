package Factory.RoomFactory;

import Factory.Room.Room;
import Factory.Room.SingleBedRoom;

public class SingleBedCreator extends RoomCreator {

    @Override
    public Room createRoom() {
        return new SingleBedRoom();
    }

}