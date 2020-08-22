package Factory.RoomFactory;

import Factory.Room.DoubleBedRoom;
import Factory.Room.Room;

public class DoubleBedCreator extends RoomCreator {

    @Override
    public Room createRoom() {

        return new DoubleBedRoom();
    }

}