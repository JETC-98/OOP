
package com.mycompany.domotica;


public class AC extends Device implements Control_Temperature{
    
    private int temperature;
    
    /*Constructor que llama al de la superclase*/
    public AC(String id, String name, String brand, String model, boolean status){
        super(id,name,brand,model,status);
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
        setStatus(true);
    }
    @Override
    public void turnOff(){
        setStatus(false);
    }
    
    @Override
    public void temperatureUp(){
        this.temperature++;
    }
    @Override
    public void temperatureDown(){
        this.temperature--;
    }
}
