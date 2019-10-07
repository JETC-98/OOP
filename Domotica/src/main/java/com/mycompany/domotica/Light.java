
package com.mycompany.domotica;

public class Light extends Device{
   
    private static int instances;
    
    public Light(String id, String name, String brand, String model, boolean status){
        super(id,name,brand,model,status);
        instances++;
    }
    
    public static int getInstancesLight(){
        return instances;
    }
    
    @Override
    public void turnOn(){
        setStatus(true);
    }
    
    @Override
    public void turnOff(){
        setStatus(false);
    }
}
