
package com.mycompany.domotica;

public class Light extends Device{
   
    
    public Light(String id, String name, String brand, String model, boolean status){
        super(id,name,brand,model,status);
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
