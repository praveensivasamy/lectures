package com.oopdemo.connectors.impl;

import com.oopdemo.connectors.IConnectors;

public class DBConnection implements IConnectors<String> {

    private String connectionType;

    /**
     * Constructor
     * This returns the instnce of this class
     * No need to explicitly declare this method
     * Constructor will be executed first
     */
    public DBConnection() {
        this.connectionType = "DEFAULT";
        System.out.println("constructor() I'm default constructor");

    }

    public DBConnection(String type) {
        this.connectionType = type;
        System.out.println("overloaded constructor() I'm overloaded by type : " + type);
    }

    public String connect() {
        System.out.println("2. I'm being called by the class object with type  : " + this.getConnectionType());
        return "Connected";
    }

    public void testConnection() {
        System.out.println("I'm connected for type : " + this.connectionType);
    }

    public void testConnection(String testType) {
        System.out.println("I'm being tested for connection  type : " + testType);
        System.out.println("I'm being connected to : " + this.connectionType);
    }

    public String getConnectionType() {
        return connectionType;
    }
}




