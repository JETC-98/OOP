
package com.mycompany.domotica;

public abstract class Device{
    
    private String id;
    private String name;
    private String brand;
    private String model;
    private boolean status;
    
    /*Constructor*/
    public Device(String id, String name, String brand, String model, boolean status){
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.status = status;
    }
    
    /*Gets y Sets*/
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
    public void setStatus(boolean status){
        this.status = status;
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
    public boolean getStatus(){
        return status;
    }
    
    /*Metodos abstractos*/
    public abstract void turnOn();
    public abstract void turnOff();
    
    /*Convertir a string la informacion del dispositivo*/
    public StringBuilder toStringDevice(){
        StringBuilder sbuilder = new StringBuilder(100);
        
        sbuilder.append(id).
                append(',').
                append(name).
                append(',').
                append(brand).
                append(',').
                append(model).
                append('\n').toString();
        
        return sbuilder;
    }
}
