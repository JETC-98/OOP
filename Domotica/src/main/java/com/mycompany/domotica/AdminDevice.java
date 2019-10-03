package com.mycompany.domotica;

import java.util.ArrayList;
import java.util.List;

public class AdminDevice {

    private List<Device> deviceList = new ArrayList<Device>();
    
    /*Constructor*/
    public AdminDevice(){
    }
    
    /*Funciones CRUD*/
    public boolean addDevice(Device target){
        boolean flag = false;
        
        deviceList.add(target);

        System.out.println("Se ha añadido "+target.getName()+" a la lista de dispositivos");

        return flag;
    }
    public boolean removeDevice(Device target){
        boolean flag = false;
        
        deviceList.remove(target);

        return flag;
    }
    public static boolean updateDevice(Device target){
        boolean flag = false;
        
        return flag;
    }

    public void printDevices()
    {
     for (int i = 0; i < deviceList.size(); i++)
     {
      System.out.println((i+1)+" "+deviceList.get(i).getName());
     }
    }

    public void turnedOnDevicesNum()
    {
     int onCounter = 0;
     for (int i = 0; i < deviceList.size(); i++)
     {
      if (deviceList.get(i).getStatus() == true)
      {
       onCounter++;
      }
     }

     System.out.println("Hay "+onCounter+" dispositivos prendidos en la casa");
    }

    public void switchDevicesRoom(Device[] array, boolean stat)
    {
     for (int i = 0; i < array.length; i++)
     {
      System.out.println("a "+array[i].getName()+" xd");
     }
    }

    public void devicesTypeNum()
    {
     int lights = 0;
     int acs = 0;
     int tvs = 0;
     for (int i = 0; i < deviceList.size(); i++)
     {
      if (deviceList.get(i) instanceof Light)
      {
       lights++;
      }
      if (deviceList.get(i) instanceof AC)
      {
       acs++;
      }
      if (deviceList.get(i) instanceof TV)
      {
       tvs++;
      }
     }

     System.out.println("Hay "+lights+" luces");
     System.out.println("Hay "+acs+" aires");
     System.out.println("Hay "+tvs+" teles");
    }
}   
