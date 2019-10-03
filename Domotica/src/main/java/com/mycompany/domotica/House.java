
package com.mycompany.domotica;

public class House {
    
    final int MAX_AREAS = 20;
    private String id;
    private String name;
    private Area areas[];
    
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
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Area[] getAreas(){
        return areas;
    }
}
