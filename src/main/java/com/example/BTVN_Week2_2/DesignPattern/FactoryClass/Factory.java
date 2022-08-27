package com.example.BTVN_Week2_2.DesignPattern.FactoryClass;

import com.example.BTVN_Week2_2.DesignPattern.ComputerType.ComputerType;
import com.example.BTVN_Week2_2.DesignPattern.SubClass.PC;
import com.example.BTVN_Week2_2.DesignPattern.SubClass.Server;
import com.example.BTVN_Week2_2.DesignPattern.SupperClass.Computer;
import org.springframework.stereotype.Component;

@Component
public class Factory {
public static final Computer getComputer(ComputerType computerType)
{
    switch (computerType)
    {
        case PC:
            return new PC();
        case SERVER:
            return new Server();
        default:
            throw new IllegalArgumentException("This computer type is unsupported");
    }
}
}
