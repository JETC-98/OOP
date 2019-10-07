
package com.mycompany.domotica;


public class AC extends Device implements Control_Temperature{
    
    private int temperature;
    private static int instances;
    
    /*Constructor que llama al de la superclase*/
    public AC(String id, String name, String brand, String model, boolean status){
        super(id,name,brand,model,status);
        instances++;
    }
    
    /*Set y Get*/
    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
    public int getTemperature(){
        return temperature;
    }
    public static int getInstancesAC(){
        return instances;
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
