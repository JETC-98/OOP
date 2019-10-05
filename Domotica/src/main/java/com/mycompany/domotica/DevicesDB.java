
package com.mycompany.domotica;

public class DevicesDB {
    
    private House house;
    
    /*Constructor*/
    public DevicesDB(House house){
        this.house = house;
    }
    
    /*Set y Get*/
    public void setHouse(House house){
        this.house = house;
    }
    public House getHouse(){
        return house;
    }
}
