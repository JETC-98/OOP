
package com.mycompany.domotica;
import java.util.ArrayList;
import java.util.List;

public class Room {
    
    private String id;
    private String name;
    private List<Device> devices = new ArrayList<>();
    
    /*Constructor*/
    public Room(String id, String name){
        this.id = id;
        this.name = name;
    }
    
    /*Set y Get*/
    public void setId(String id){
        this.id = id;
    }
    public void SetName(String name){
        this.name = name;
    }
    public void setDevices(List<Device> devices){
        this.devices = devices;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public List<Device> getDevices(){
        return devices;
    }
  
    
    /*Método para prender/apagar todos los dispositivos de la habitación*/
    public void switchEverything(boolean mode){ //True(Encender)/False(Apagar)
        int i;
        if(mode){
            for(i=0;i<devices.size();i++){
                devices.get(i).turnOn(); 
            }
        }else{
           for(i=0;i<devices.size();i++){
                devices.get(i).turnOff(); 
            } 
        }
    }
}
