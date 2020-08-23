package com.company;


import com.company.Decorator.CleanServiceDecorator;
import com.company.Decorator.FoodServiceDecorator;
import com.company.Facade.PaymentFacade;
import com.company.Factory.RoomFactory.DoubleBedCreator;
import com.company.Factory.RoomFactory.RoomCreator;
import com.company.Factory.RoomFactory.SingleBedCreator;
import com.company.Room.Room;
import com.company.Singleton.Singleton;

/**
 * main
 */



public class Main {

    private static RoomCreator roomCreator;
    public static double totalAmountToBePaid = 0;

    public static void main(String[] args) {
        System.out.println("\n\n======== Welcome to the Hotel Booking System =========\n");

        handleDatabaseConnection();
      handleRoomCreation(1); // 0 means singleBed, 1 means doubleBed
 handlePayment();

    }

    public static void handleRoomCreation(int type) {
        System.out.println("\n==== Room Creation ====");
        if (type == 0) {
            roomCreator = new SingleBedCreator();

        } else {
            roomCreator = new DoubleBedCreator();
        }

        System.out.println("Room Created : " + roomCreator.getRoom().getRoomType() + " which costs " + roomCreator.getRoom().getCost() );


        Room decoratedRoom = new CleanServiceDecorator(new FoodServiceDecorator (roomCreator.getRoom()));


   System.out.println(decoratedRoom.getRoomDescription());
        totalAmountToBePaid = decoratedRoom.getCost();
        System.out.println("Total Cost : "  + totalAmountToBePaid);


    }

    public static void handlePayment() {
        System.out.println("\n==== Payment ====");


        PaymentFacade payment = new PaymentFacade();
        payment.setCredentials(12345678, 1234);
        payment.makePayment(totalAmountToBePaid);
    }

    public static void handleDatabaseConnection() {
        System.out.println("==== Database Setup ====");
        Singleton databaseSingletonInstance = Singleton.getInstance("Database_name");
        if (databaseSingletonInstance != null) {
            System.out.println("Database Connected");
        } else {
            System.out.println("Database Connection Failed");
        }
    }
}
