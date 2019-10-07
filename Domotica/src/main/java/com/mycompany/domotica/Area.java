
package com.mycompany.domotica;

public class Area {
    
    final int MAX_ROOMS = 20;
    private String id;
    private String name;
    private Room rooms[];
    private int roomsCounter;
    
    /*Constructor*/
    public Area(String id, String name){
        this.id = id;
        this.name = name;
        rooms = new Room[MAX_ROOMS];
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
        this.roomsCounter = rooms.length;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Room getRoom(int i){
        return rooms[i];
    }
    public Room[] getRooms(){
        return rooms;
    }
    public int getRoomsCounter(){
        return roomsCounter;
    }
}
