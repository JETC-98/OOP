
package com.mycompany.domotica;


public class AC extends Device implements Control_Temperature{
    
    private int temperature;
    
    
    public AC(String id, String name, String brand, String model){
        super(id,name,brand,model);
    }
    
    @Override
    public void turnOn(){
        
    }
    @Override
    public void turnOff(){
        
    }
    
    @Override
    public void temperatureUp(){
        
    }
    @Override
    public void temperatureDown(){
        
    }
}
