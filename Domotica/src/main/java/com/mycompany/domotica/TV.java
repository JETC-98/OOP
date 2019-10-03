
package com.mycompany.domotica;

public class TV extends Device implements Control_Volume, Control_Channel{
    
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
    
    @Override
    public void volumeUp(){
        
    }
    @Override
    public void volumeDown(){
        
    }
    
    @Override
    public void channelUp(){
        
    }
    @Override
    public void channelDown(){
        
    }
}
