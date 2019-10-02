
package com.mycompany.domotica;

public class AdminDevices {
    
    final int MAX_DEV = 100;
    private Device[] devices;
    private int deviceCounter;
    
    /*Constructor que inicializa el arreglo */
    public AdminDevices(){
        this.devices = new Device[MAX_DEV];
        this.deviceCounter = 0;
    }
    
    /*Sets y Gets*/
    public void setDevices(Device[] devices){
        this.devices = devices;
    }
    public void setDeviceCounter(int deviceCounter){
        this.deviceCounter = deviceCounter;
    }
    public Device[] getDevices(){
        return devices;
    }
    public int getDeviceCounter(){
        return deviceCounter;
    }
    
    /*Funciones CRUD*/
    /*Añadir dispositivo*/
    public boolean addDevice(Device device){
        boolean flag = false;
        if(deviceCounter < MAX_DEV){
            devices[deviceCounter] = device;
            deviceCounter++;
            flag = true;
        }
        return flag;
    }
    
    /*Eliminar dispositivo*/
    public boolean removeDevice(String id){
        boolean flag = true;
        int pos = getDevPositionById(id);
        int i;
        
        if(deviceCounter > 0){
            for(i= pos;i<deviceCounter-1;i++){
                devices[i] = devices[i+1];
            }
            deviceCounter--;
            flag = true;
        }
        return flag;
    }
    
    /*Actualizar información del dispositivo (nombre)*/
    public void updateDevice(String id, String name){
        int i;
        int pos = getDevPositionById(id);
        
        devices[pos].setName(name);

    }
    
    /*Obtener la posicion en el arreglo del dispositivo a buscar */
    public int getDevPositionById(String id){
        int i;
        for(i=0;i<deviceCounter;i++){
            if(id.equals(devices[i].getId())){
                break;
            }
        }
        return i;
    }
}
