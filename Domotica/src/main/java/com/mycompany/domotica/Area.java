
package com.mycompany.domotica;

public class Area {
    
    final int MAX_AREA = 20;
    private String id;
    private String name;
    private Room rooms[];
    
    /*Constructor*/
    public Area(String id, String name){
        this.id = id;
        this.name = name;
        rooms = new Room[MAX_AREA];
    }
    
    /*Set y Get*/
    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setRooms(Room rooms[]){
        this.rooms = rooms;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Room[] getRooms(){
        return rooms;
    }
}
