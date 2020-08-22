package Factory.RoomFactory;

import Factory.Room.Room;

public abstract class RoomCreator {

    public Room getRoom() {
        Room room = createRoom();
        return room;
    }

    public abstract Room createRoom();

}