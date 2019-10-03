
package com.mycompany.domotica;


public class Room {
    
    private String id;
    private String name;
    private Device devices[];
    
    public Room(String id, String name){
        this.id = id;
        this.name = name;
    }
    
    public void setId(String id){
        this.id = id;
    }
    public void SetName(String name){
        this.name = name;
    }
    public void SetDevices(Device devices[]){
        this.devices = devices;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Device[] getDevices(){
        return devices;
    }
}
