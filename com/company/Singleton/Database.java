package com.company.Singleton;

public class Database {

    private static volatile Database databaseInstance;
    public String databaseAddress;

    private Database(String databaseAddress) {

        this.databaseAddress = databaseAddress;

    }

    public static Database getInstance(String databaseAddress) {
        if (databaseInstance == null) {

            synchronized (Database.class) {

                if (databaseInstance == null) {
                    databaseInstance = new Database(databaseAddress);
                }
            }

            return databaseInstance;
        }

        return databaseInstance;
    }

    public String executeQuery(String query) {
        // pass query to the database using the connection made

        return "Data Fetched";

    }

}