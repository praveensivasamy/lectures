package com.oopdemo.connectors.impl;

import com.oopdemo.connectors.IConnectors;

public class MainframeConnection implements IConnectors<Integer> {

    public MainframeConnection(String type) {

    }

    public String mainFrameConnection(){
        return "connected";
    }

    @Override
    public Integer connect() {
        return 1;
    }
}
