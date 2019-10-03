
package com.mycompany.domotica;

public class House {
    
    final int MAX_AREAS = 4;
    private String id;
    private String name;
    private Area areas[];
    private int areasCounter;
    
    /*Constructor*/
    public House(String id, String name){
        this.id = id;
        this.name = name;
        areas = new Area[MAX_AREAS];
    }
    
    /*Set y Get*/
    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAreas(Area areas[]){
        this.areas = areas;
        this.areasCounter = areas.length;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Area getArea(int i){
        return areas[i];
    }
    public Area[] getAreas(){
        return areas;
    }
    public int getAreasCounter(){
        return areasCounter;
    }
}
