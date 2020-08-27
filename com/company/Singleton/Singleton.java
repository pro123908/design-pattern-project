package com.company.Singleton;

public class Singleton {

    private static volatile Singleton instance;
    public String databaseAddress;

    private Singleton(String databaseAddress) {

        this.databaseAddress = databaseAddress;

    }

    public static Singleton getInstance(String databaseAddress) {
        if (instance == null) {

            synchronized (Singleton.class) {

                if (instance == null) {
                    instance = new Singleton(databaseAddress);
                }
            }

            return instance;
        }

        return instance;
    }

}