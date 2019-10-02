
package com.mycompany.domotica;


public abstract class Device {
    
    private String id;
    private String name;
    private String brand;
    private String model;
    private boolean status;
    
    /*Constructor*/
    public Device(String id, String name, String brand, String model){
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.model = model;
    }
    
    /*Sets y Gets*/
    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    
    
    /*Métodos abstractos*/
    public abstract void turnOn();
    public abstract void turnOff();
}
