package com.oopdemo.connectors.impl;

import com.oopdemo.connections.MyConnection;
import com.oopdemo.connectors.IConnectors;

public class RestConnection implements IConnectors<MyConnection> {


    public String restConnection() {
        return "connected";
    }

    @Override
    public MyConnection connect() {


        return null;
    }
}
