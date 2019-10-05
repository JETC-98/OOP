/*
Todo lo relacionado a los dispositivos de la casa
*/
package com.mycompany.domotica;

public class AdminDevice {
    
    private House house;
    private int deviceCounterByHouse;
    private DevicesDB devicesDB;
    
    /*Constructor*/
    public AdminDevice(House house, int deviceCounterByHouse){ //Cuando se instancie un AdminDevice, se creara la BD de los dispositivos
        this.house = house;
        this.deviceCounterByHouse = deviceCounterByHouse;
        this.devicesDB = new DevicesDB(house);
        devicesDB.createDB();
    }
    
    /*Set y Get*/
    public void setHouse(House house){
        this.house = house;
    }
    public void setDeviceCounter(int deviceCounterByHouse){
        this.deviceCounterByHouse = deviceCounterByHouse;
    }
    public void setDevicesDB(DevicesDB devicesDB){
        this.devicesDB = devicesDB;
    }
    public int getDeviceCounter(){
        return deviceCounterByHouse;
    }
    public House getHouse(){
        return house;
    }
    public DevicesDB getDevicesDB(){
        return devicesDB;
    }

    
    /*Funciones CRUD*/
    /*Añadir dispositivo a una habitacion*/
    public boolean addDevice(Room room, Device device){
        boolean flag = false;
        int i,j;
        for(i=0;i<house.getAreas().size();i++){ /*Numero de areas en la casa*/
            for(j=0;j<house.getAreas().get(i).getRooms().size();j++){ /*Numero de cuartos dentro de esa area*/
                if(house.getAreas().get(i).getRooms().get(j).equals(room)){ /*Si encuentra el cuarto donde se quiere añadir el dispositivo*/
                    house.getAreas().get(i).getRooms().get(j).getDevices().add(device);
                    deviceCounterByHouse++;
                    devicesDB.updateDB();
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
        for(i=0;i<house.getAreas().size();i++){ /*Numero de areas en la casa*/
            for(j=0;j<house.getAreas().get(i).getRooms().size();j++){ /*Numero de cuartos dentro de esa area*/
                if(house.getAreas().get(i).getRooms().get(j).getDevices().contains(device)){ /*Si encuentra el cuarto donde se quiere eliminar el dispositivo*/
                    house.getAreas().get(i).getRooms().get(j).getDevices().remove(device);
                    deviceCounterByHouse--;
                    devicesDB.updateDB();
                    flag = true;
                }
            }
        }
        
        return flag;
    }
    
    /*Actualizar dispositivo de una habitación*/
    public boolean updateDevice(Device device, String newName){
        boolean flag = false;
        int i,j,k;
        for(i=0;i<house.getAreas().size();i++){ //Numero de areas en la casa
            for(j=0;j<house.getAreas().get(i).getRooms().size();j++){ //Numero de cuartos dentro de un area i
                for(k=0;k<house.getAreas().get(i).getRooms().get(j).getDevices().size();k++){ //Numero de dispositivos en una habitación j
                    if(house.getAreas().get(i).getRooms().get(j).getDevices().contains(device)){ //Si encuentra el cuarto donde se quiere actualizar el dispositivo
                        house.getAreas().get(i).getRooms().get(j).getDevices().get(k).setName(newName);
                        flag = true;
                        devicesDB.updateDB();
                        break;
                    }
                }
            }
        }
        
        return flag;
    }
    
    /*Encontrar la posicion de un dispositivo en el arreglo de su habitacion*/
    public int getDevicePosition(Device device){
        int pos = -1;
        int i,j,k;
        for(i=0;i<house.getAreas().size();i++){
            for(j=0;j<house.getAreas().get(i).getRooms().size();j++){
                for(k=0;k<house.getAreas().get(i).getRooms().get(j).getDevices().size();k++){
                    if(house.getAreas().get(i).getRooms().get(j).getDevices().get(k).equals(device)){
                        pos = k;
                        break;
                    }
                }
            }
        }
        
        return pos;
    }
    
    /*-----------------------------------------------------------------------------------------------------------------------*/
    
    /*Indica cuantos dispositivos estan prendidos*/
    public int howManyOn(){
        int onCounter = 0;
        int i,j,k;
        for(i=0;i<house.getAreas().size();i++){
            for(j=0;j<house.getAreas().get(i).getRooms().size();j++){
                if(!house.getAreas().get(i).getRooms().get(j).getDevices().isEmpty()){ //Si en el cuarto hay algun dispositivo
                    for(k=0;k<house.getAreas().get(i).getRooms().get(j).getDevices().size();k++){
                        if(house.getAreas().get(i).getRooms().get(j).getDevices().get(k).getStatus()){ //Si esta encendido
                            onCounter++;
                        }
                    }
                }
            }
        }
        
        return onCounter;
    }
    
   
}    
  
