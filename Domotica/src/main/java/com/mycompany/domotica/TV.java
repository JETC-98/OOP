
package com.mycompany.domotica;

public class TV extends Device{
    
    private int volume;
    private int channel;
    
    public TV(String id, String name, String brand, String model){
        super(id,name,brand,model);
    }
    
    @Override
    public void turnOn(){
        
    }
    
    @Override
    public void turnOff(){
        
    }
}
