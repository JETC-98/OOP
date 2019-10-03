
package com.mycompany.domotica;

public class AdminHouse {
    
    private House house;
    
    public AdminHouse(House house){
        this.house = house;
    }
    
    public void setHouse(House house){
        this.house = house;
    }
    public House getHouse(){
        return house;
    }
    
    
}
