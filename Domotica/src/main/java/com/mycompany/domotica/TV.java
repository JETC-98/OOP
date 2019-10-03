
package com.mycompany.domotica;

public class TV extends Device implements Control_Volume, Control_Channel{
    
    private int volume;
    private int channel;
    private static int instances;
    
    /*Constructor*/
    public TV(String id, String name, String brand, String model, boolean status){
        super(id,name,brand,model,status);
        instances++;
    }
    
    /*Set y Get*/
    public void setVolume(int volume){
        this.volume = volume;
    }
    public void setChannel(int channel){
        this.channel = channel;
    }
    public int getVolume(){
        return volume;
    }
    public int getChannel(){
        return channel;
    }
    public static int getInstancesTV(){
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
    public void volumeUp(){
        this.volume++;
    }
    @Override
    public void volumeDown(){
        this.volume--;
    }
    
    @Override
    public void channelUp(){
        this.channel++;
    }
    @Override
    public void channelDown(){
        this.channel--;
    }
}
