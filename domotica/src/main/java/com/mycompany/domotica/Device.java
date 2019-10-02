
package com.mycompany.domotica;


public abstract class Device {
    
    private String id;
    private String name;
    private String brand;
    private String model;
    private boolean status;
    
    public abstract void turnOn();
    public abstract void turnOff();
}
