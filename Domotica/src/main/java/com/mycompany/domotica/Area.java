
package com.mycompany.domotica;
import java.util.ArrayList;
import java.util.List;

public class Area {
    
    private String id;
    private String name;
    private List<Room> rooms;
    
    /*Constructor*/
    public Area(String id, String name){
        this.id = id;
        this.name = name;
        rooms = new ArrayList<>();
    }
    
    /*Set y Get*/
    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setRooms(List<Room> rooms){
        this.rooms = rooms;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public List<Room> getRooms(){
        return rooms;
    }
}
