
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
    
    /*Convertir a string la informacion de la casa*/
    @Override
    public String toString(){
        int i,j,k;
        String output = "";
        for(i=0;i<house.getAreas().length;i++){
            for(j=0;j<house.getArea(i).getRooms().length;j++){
                    
                    output = new StringBuffer(house.getName()).
                            append(".").
                            append(house.getArea(i).getName()).
                            append(":").
                            append(house.getArea(i).getRoom(j).getName()).
                            append(",").toString();
            }
        }
        
        return output;
    }
    
    /*Funciones CRUD*/
    
}
