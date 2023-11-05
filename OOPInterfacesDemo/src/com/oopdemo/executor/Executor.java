package com.oopdemo.executor;

import com.oopdemo.connectors.impl.DBConnection;
import com.oopdemo.connectors.impl.MainframeConnection;
import com.oopdemo.connectors.impl.RestConnection;

public class Executor {

    /**
     * Entry Point of java
     * Any change in the signature or access specifier , this method will be treated as new method
     *
     * @param args
     */
    public static void main(String[] args) {
        databaseConnection();
        mainFrameConnection();
        restConnection();
    }

    private static void databaseConnection() {
        /**
         * A class instantiation means creating an object of a class
         * For class instantiation there must be a default public constructor
         */
        DBConnection connection = new DBConnection(); // Class Instantiation
        connection.testConnection();
        String message = connection.connect();
        System.out.println(message);

        // Explicit type
        DBConnection connection1 = new DBConnection("Database");
        connection1.testConnection();
        message = connection1.connect();
        System.out.println(message);

        // Default Type instantioation
        var connection2 = new DBConnection();
        connection2.testConnection();
        connection2.testConnection("Oracle DB");
    }


    private static void mainFrameConnection() {
        var mainFrameConnection = new MainframeConnection("Simple");
        System.out.println(mainFrameConnection.mainFrameConnection());

    }

    private static void restConnection() {
        var restConnection = new RestConnection();
        System.out.println(restConnection.restConnection());
    }
}
