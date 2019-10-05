
package com.mycompany.domotica;

public class AdminHouse {
    
    private House house;
    
    /*Constructor*/
    public AdminHouse(House house){
        this.house = house;
    }
    
    /*Set y Get*/
    public void setHouse(House house){
        this.house = house;
    }
    public House getHouse(){
        return house;
    }
    
    
    /*Funciones CRUD*/
    
    /*Funciones para Areas*/
    /*Añadir un area*/
    public boolean addArea(Area area){
        boolean flag = false;
        
        return flag;
    }
    
    /*Eliminar un area*/
    public boolean removeArea(Area area){
        boolean flag = false;
        
        return flag;
    }
    
    /*Actualizar un area (nombre)*/
    public boolean updateArea(Area area, String newName){
        boolean flag = false;
        
        return flag;
    }
    
    /*Obtener la posición de un Area en una lista de areas*/
    public int getAreaPosition(Area area){
        int pos = 0;
        
        return pos;
    }
    
    
    /*Funciones para habitaciones*/
        /*Añadir una habitacion*/
    public boolean addRoom(Area area, Room room){
        boolean flag = false;
        
        return flag;
    }
    
    /*Eliminar una habitacion*/
    public boolean removeRoom(Room room){
        boolean flag = false;
        
        return flag;
    }
    
    /*Actualizar una habitacion (nombre)*/
    public boolean updateRoom(Room room, String newName){
        boolean flag = false;
        
        return flag;
    }
    
    /*Obtener la posición de una habitacion en una lista de habitaciones*/
    public int getRoomPosition(Area area){
        int pos = 0;
        
        return pos;
    }
    
}
