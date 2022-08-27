package com.example.BTVN_Week2_2.DesignPattern.Controller;

import com.example.BTVN_Week2_2.DesignPattern.ComputerType.ComputerType;
import com.example.BTVN_Week2_2.DesignPattern.FactoryClass.Factory;
import com.example.BTVN_Week2_2.DesignPattern.Response.ComputerResponse;
import com.example.BTVN_Week2_2.DesignPattern.SupperClass.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value="/factory_method")
public class FactoryMethodController {
    @Autowired
    Factory factory;
@GetMapping("/{type}")
    ResponseEntity<?> getType(@PathVariable("type") String type)
{
    try{
        Computer computer=factory.getComputer(ComputerType.valueOf(type.toUpperCase()));
        ComputerResponse computerResponse=new ComputerResponse();
        Map<String,String> singleton=new HashMap<>();
        singleton.put("computerFactory.toString()",computer.toString());
        Map<String,String >factoryMap=new HashMap<>();
        factoryMap.put("computer.getClass()",computer.getClass().toString());
        factoryMap.put("computer.getType()",computer.getType().toString());
        computerResponse.setSingleton(singleton);
        computerResponse.setFactory(factoryMap);
        return ResponseEntity.ok(computerResponse);

    }
    catch(Exception e)
    {
        throw new IllegalArgumentException("Invalid Type");
    }
}
}
