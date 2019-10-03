
package com.mycompany.domotica;

public class AdminDevice {
    
    private Device device;
    
    /*Constructor*/
    public AdminDevice(Device device){
        this.device = device;
    }
    
    /*Set y Get*/
    public void setDevice(Device device){
        this.device = device;
    }
    public Device getDevice(){
        return device;
    }
    
    /*Funciones CRUD*/
    
}
