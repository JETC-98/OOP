
package com.mycompany.domotica;

public class AdminHouse {
    
    private House house;
    private ConfigurateHouse configHouse;
    
    /*Constructor*/
    public AdminHouse(House house){ //Al crear un AdminHouse se crea la configuracion inicial de la casa que se reciba
        this.house = house;
        this.configHouse = new ConfigurateHouse(house);
        configHouse.initConfig();
    }
    
    /*Set y Get*/
    public void setHouse(House house){
        this.house = house;
    }
    public void setConfig(ConfigurateHouse configHouse){
        this.configHouse = configHouse;
    }
    public House getHouse(){
        return house;
    }
    public ConfigurateHouse getConfig(){
        return configHouse;
    }
    
    
    /*Métodos CRUD*/
    
    /*Métodos para Areas*/
    /*Añadir un area*/
    public boolean addArea(Area area){
        boolean flag = false;
        if(!house.getAreas().contains(area)){ //Si el area no se ha añadido
            house.getAreas().add(area);
            flag = true;
            configHouse.updateConfig();
        }
        return flag;
    }
    
    /*Eliminar un area*/
    public boolean removeArea(Area area){
        boolean flag = false;
        if(house.getAreas().contains(area)){ //Si la casa contiene el area
            house.getAreas().remove(area);
            flag = true;
            configHouse.updateConfig();
        }
        
        return flag;
    }
    
    /*Actualizar un area (nombre)*/
    public boolean updateArea(Area area, String newName){
        boolean flag = false;
        int pos;
        if(house.getAreas().contains(area)){ //Si la casa contiene el area
            pos = getAreaPosition(area);
            house.getAreas().get(pos).setName(newName);
            flag = true;
            configHouse.updateConfig();
        }
        return flag;
    }
    
    /*Obtener la posicion de un area dentro de una lista de areas*/
    public int getAreaPosition(Area area){
        int pos = -1;
        int i;
        for(i=0;i<house.getAreas().size();i++){
            if(house.getAreas().get(i).equals(i)){ //Cuando encuentre el area devuelve la pos
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    
    /*Métodos para habitaciones*/
        /*Añadir una habitacion*/
    public boolean addRoom(Area area, Room room){
        boolean flag = false;
        int i;
        
        for(i=0;i<house.getAreas().size();i++){
            if(house.getAreas().get(i).equals(area) && !house.getAreas().get(i).getRooms().contains(room)){ //Si el area se encuentra y no contiene el cuarto a añadir
                house.getAreas().get(i).getRooms().add(room);
                flag = true;
                configHouse.updateConfig();
            }
        }
        return flag;
    }
    
    /*Eliminar una habitacion*/
    public boolean removeRoom(Room room){
        boolean flag = false;
        int i;
        
        for(i=0;i<house.getAreas().size();i++){
            if(house.getAreas().get(i).getRooms().contains(room)){ //Si se halla el area que contiene el cuarto
                house.getAreas().get(i).getRooms().remove(room);
                flag = true;
                configHouse.updateConfig();
            }
        }
        
        return flag;
    }
    
    /*Actualizar una habitacion (nombre)*/
    public boolean updateRoom(Room room, String newName){
        boolean flag = false;
        int pos;
        int i;
        
        for(i=0;i<house.getAreas().size();i++){
            if(house.getAreas().get(i).getRooms().contains(room)){ //Si la casa contiene el cuarto
                pos = getRoomPosition(room);
                house.getAreas().get(i).getRooms().get(pos).SetName(newName); //Actualiza el nombre
                flag = true;
                configHouse.updateConfig();
                break;
            }
        }
        
        return flag;
    }
    
    /*Obtener la posicion de una habitacion en una lista */
    public int getRoomPosition(Room room){
        int pos = -1;
        int i,j;
        
        for(i=0;i<house.getAreas().size();i++){
            for(j=0;j<house.getAreas().get(i).getRooms().size();j++){
                if(house.getAreas().get(i).getRooms().get(j).equals(room)){
                    pos = j;
                    break;
                }
            }
        }
        return pos;
    }

    
}
