
package com.mycompany.domotica;
import java.util.ArrayList;
import java.util.List;

public class House {
    
    private String id;
    private String name;
    private List<Area> areas;
    
    /*Constructor*/
    public House(String id, String name){
        this.id = id;
        this.name = name;
        areas  = new ArrayList<>();
    }
    
    /*Set y Get*/
    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAreas(List<Area> areas){
        this.areas = areas;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public List<Area> getAreas(){
        return areas;
    }

  /*Convertir a string la informacion de la casa*/
    public StringBuilder toStringHouse(){
        int i,j,k;
        StringBuilder sbuilder = new StringBuilder(1000);

        sbuilder.append(name).
                append("...").
                append('\n').toString();
        
        for(i=0;i<areas.size();i++){ //Concatenar primero cada area aunque no tengan habitaciones
            sbuilder.
                append(areas.get(i).getName()).
                append(':').
                append('\n').toString();
            if(!areas.get(i).getRooms().isEmpty()){ //Si tiene habitacion(es) concatenalas
                for(j=0;j<areas.get(i).getRooms().size();j++){
                    sbuilder.append('\t').
                        append(areas.get(i).getRooms().get(j).getName()).
                        append('\n').toString();                   
                }
            }
        } 
        return sbuilder;
    }
}
