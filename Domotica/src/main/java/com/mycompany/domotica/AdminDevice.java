
package com.mycompany.domotica;

public class AdminDevice {
    
    private House house;
    private int deviceCounterByHouse;
    
    /*Constructor*/
    public AdminDevice(House house, int deviceCounterByHouse){
        this.house = house;
        this.deviceCounterByHouse = deviceCounterByHouse;
    }
    
    /*Set y Get*/
    public void setHouse(House house){
        this.house = house;
    }
    public void setDeviceCounter(int deviceCounterByHouse){
        this.deviceCounterByHouse = deviceCounterByHouse;
    }
    public int getDeviceCounter(){
        return deviceCounterByHouse;
    }
    public House getHouse(){
        return house;
    }

    
    /*Funciones CRUD*/
    /*Añadir dispositivo a una habitacion*/
    public boolean addDevice(Room room, Device device){
        boolean flag = false;
        int i,j;
        for(i=0;i<house.getAreasCounter();i++){ /*Numero de areas en la casa*/
            for(j=0;j<house.getArea(i).getRoomsCounter();j++){ /*Numero de cuartos dentro de esa area*/
                if(house.getArea(i).getRoom(j).equals(room)){ /*Si encuentra el cuarto donde se quiere añadir el dispositivo*/
                    house.getArea(i).getRoom(j).getDevices().add(device);
                    deviceCounterByHouse++;
                    flag = true;
                }
            }
        }
        
        return flag;
    }
    
    /*Eliminar dispositivo de una habitacion*/
    public boolean removeDevice(Device device){
        boolean flag = false;
        int i,j;
        for(i=0;i<house.getAreasCounter();i++){ /*Numero de areas en la casa*/
            for(j=0;j<house.getArea(i).getRoomsCounter();j++){ /*Numero de cuartos dentro de esa area*/
                if(house.getArea(i).getRoom(j).getDevices().contains(device)){ /*Si encuentra el cuarto donde se quiere eliminar el dispositivo*/
                    house.getArea(i).getRoom(j).getDevices().remove(device);
                    deviceCounterByHouse--;
                    flag = true;
                }
            }
        }
        
        return flag;
    }
    
    /*Actualizar dispositivo de una habitación*/
    public boolean updateDevice(Device device){
        boolean flag = false;
        int i,j;
        for(i=0;i<house.getAreasCounter();i++){ /*Numero de areas en la casa*/
            for(j=0;j<house.getArea(i).getRoomsCounter();j++){ /*Numero de cuartos dentro de esa area*/
                if(house.getArea(i).getRoom(j).getDevices().contains(device)){ /*Si encuentra el cuarto donde se quiere actualizar el dispositivo*/
                    house.getArea(i).getRoom(j).getDevices().set(getDevicePosition(device), device);
                    flag = true;
                }
            }
        }
        
        return flag;
    }
    
    /*Encontrar la posicion de un dispositivo en el arreglo de su habitacion*/
    public int getDevicePosition(Device device){
        int pos = 0;
        int i,j,k;
        for(i=0;i<house.getAreas().length;i++){
            for(j=0;j<house.getArea(i).getRooms().length;j++){
                for(k=0;k<house.getArea(i).getRoom(j).getDevices().size();k++){
                    if(house.getArea(i).getRoom(j).getDevices().get(k).equals(device)){
                        pos = k;
                        break;
                    }
                }
            }
        }
        
        return pos;
    }
    
    /*-----------------------------------------------------------------------------------------------------------------------*/
    
    /*Convertir a string la informacion de los dispositivos en la casa*/
    public StringBuilder toStringDevices(){
        int i,j,k;
        StringBuilder sbuilder = new StringBuilder(1000);

        for(i=0;i<house.getAreas().length;i++){
            for(j=0;j<house.getArea(i).getRooms().length;j++){
                if(!house.getArea(i).getRoom(j).getDevices().isEmpty()){ //Si en el cuarto hay algún dispositivo
                    for(k=0;k<house.getArea(i).getRoom(i).getDevices().size();k++){
                            sbuilder.
                                    append(house.getArea(i).getRoom(j).getDevices().get(k).toStringDevice()).
                                    toString();
                        }
                            
                    }      
                }                            
            }
        return sbuilder;
    }
    
    /*Indica cuantos dispositivos estan prendidos*/
    public int howManyOn(){
        int onCounter = 0;
        int i,j,k;
        for(i=0;i<house.getAreas().length;i++){
            for(j=0;j<house.getArea(i).getRooms().length;j++){
                if(!house.getArea(i).getRoom(j).getDevices().isEmpty()){ //Si en al cuarto hay algun dispositivo
                    for(k=0;k<house.getArea(i).getRoom(j).getDevices().size();k++){
                        if(house.getArea(i).getRoom(j).getDevices().get(k).getStatus()){ //Si esta encendido
                            onCounter++;
                        }
                    }
                }
            }
        }
        
        return onCounter;
    }
    
   
    
    /*Convertir a string la informacion de la casa con dispositivos
    public StringBuilder toStringDevices(){
        int i,j,k;
        StringBuilder sbuilder = new StringBuilder(1000);

        for(i=0;i<house.getAreas().length;i++){
            for(j=0;j<house.getArea(i).getRooms().length;j++){
                    sbuilder.append(house.getName()).
                            append('.').
                            append(house.getArea(i).getName()).
                            append(':').
                            append(house.getArea(i).getRoom(j).getName()).
                            append('.').toString();
                if(!house.getArea(i).getRoom(j).getDevices().isEmpty()){
                    for(k=0;k<house.getArea(i).getRoom(i).getDevices().size();k++){
                            sbuilder.append(house.getArea(i).getRoom(j).getDevices().get(k).getId()).
                            append(',').
                            append(house.getArea(i).getRoom(j).getDevices().get(k).getName()).
                            append(',').
                            append(house.getArea(i).getRoom(j).getDevices().get(k).getModel()).
                            append(',').
                            append(house.getArea(i).getRoom(j).getDevices().get(k).getBrand()).
                            append('.').toString();
                        }
                            sbuilder.append('\n').toString();
                    }else{
                        sbuilder.append('\n').toString();
                    }      
                }                            
            }
        return sbuilder;
    } */
        
}
  
