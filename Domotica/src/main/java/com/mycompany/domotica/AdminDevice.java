
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
                for(k=0;k<house.getArea(i).getRoom(j).getDevices().size();j++){
                    if(house.getArea(i).getRoom(j).getDevice(k).equals(device)){
                        pos = k;
                        break;
                    }
                }
            }
        }
        
        return pos;
    }
}   
