package com.example.BTVN_Week2_2.DesignPattern.Response;

import lombok.Data;

import java.util.Map;

@Data
public class ComputerResponse {
    private Map<String,String> singleton;
    private Map<String,String> factory;
 }
