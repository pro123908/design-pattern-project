package com.company.Singleton;

public class DatabaseOperations {
    Database databaseInstance;

    public DatabaseOperations(Database instance) {
        databaseInstance = instance;

    }

    public void getData(String query) {
        databaseInstance.executeQuery(query);
    }

}