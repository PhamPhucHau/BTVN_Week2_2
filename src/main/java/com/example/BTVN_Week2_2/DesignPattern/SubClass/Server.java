package com.example.BTVN_Week2_2.DesignPattern.SubClass;

import com.example.BTVN_Week2_2.DesignPattern.SupperClass.Computer;

public class Server implements Computer {
    @Override
    public String getType()
    {
        return "Server";
    }
}
