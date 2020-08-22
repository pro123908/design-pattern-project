
/**
 * main
 */

import Facade.*;
import Factory.Room.Room;
import Factory.RoomFactory.DoubleBedCreator;
import Factory.RoomFactory.RoomCreator;
import Factory.RoomFactory.SingleBedCreator;
import Singleton.Singleton;

public class main {

    private static RoomCreator roomCreator;

    public static void main(String[] args) {
        System.out.println("Hello World");

        handleDatabaseConnection();
        handleRoomCreation(0); // 0 means singleBed, 1 means doubleBed
        handlePayment();

    }

    public static void handleRoomCreation(int type) {
        if (type == 0) {
            roomCreator = new SingleBedCreator();

        } else {
            roomCreator = new DoubleBedCreator();
        }

        Room newRoom = roomCreator.getRoom();
        newRoom.getCost();
        newRoom.getRoomDescription();
        newRoom.getRoomType();
    }

    public static void handlePayment() {
        double totalAmount = 500.00;

        PaymentFacade payment = new PaymentFacade();
        payment.setCredentials(12345678, 1234);
        payment.makePayment(totalAmount);
    }

    public static void handleDatabaseConnection() {
        Singleton databaseSingletonInstance = Singleton.getInstance("Database_name");
        if (databaseSingletonInstance != null) {
            System.out.println("Database Connected");
        } else {
            System.out.println("Database Connection Failed");
        }
    }
}