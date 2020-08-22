abstract class RoomDecorator implements Room {
    protected Room tempRoom;

    public RoomDecorator (Room newRoom) {
        tempRoom = newRoom;
    }

    public String getRoomDescription() {
        return tempRoom.getRoomDescription();
    }

    public double getCost() {
        return tempRoom.getCost();
    }

    public String getRoomType() {
        return tempRoom.getRoomType();
    }
}