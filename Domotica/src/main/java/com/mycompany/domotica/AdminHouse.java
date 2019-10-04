
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
    
    /*Añadir un area*/
    public boolean addArea(){
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
    
    /*Obtener la posición de un Area en un vector de areas*/
    public int getAreaPosition(Area area){
        int pos;
        
        return pos;
    }
}
