
package com.mycompany.domotica;


public class AC extends Device implements Control_Temperature{
    
    private int temperature;
    
    /*Constructor que llama al de la superclase*/
    public AC(String id, String name, String brand, String model){
        super(id,name,brand,model);
    }
    
    /*Set y Get*/
    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
    public int getTemperature(){
        return temperature;
    }
    
    /*Funciones*/
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
