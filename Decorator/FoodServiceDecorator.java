package Decorator;

public class FoodServiceDecorator extends RoomDecorator {
    public FoodServiceDecorator(Room newRoom) {
        super(newRoom);
        System.out.println("Adding Special Food Service");
    }

    public String getRoomDescription() {
        return tempRoom.getRoomDescription() + "and additional special Food Service Added!";
    }

    public double getCost() {
        System.out.println("Cost of Special Food Service: " + 50.0);
        return tempRoom.getCost() + 50.0;
    }

    public String getRoomType() {
        return tempRoom.getRoomType();
    }

}