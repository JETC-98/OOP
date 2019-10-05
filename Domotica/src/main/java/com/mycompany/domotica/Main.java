
package com.mycompany.domotica;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        /*CREACIÓN ESTÁTICA DE LA CASA*/
        
        /*Creando habitaciones*/
        List<Room> lowRooms = new ArrayList<>();
            Room low_Din = new Room("1110", "Dining room");
            Room low_Liv = new Room("1120", "Living room");
            Room low_Kit = new Room("1130", "Kitchen");
        List<Room> upRooms = new ArrayList<>();
            Room up_Liv = new Room("1210", "Up Level living room");
            Room up_Kid = new Room("1220", "Kid's bedroom");
            Room up_Main = new Room("1230", "Main bedroom");
        List<Room> backyardRooms = new ArrayList<>();
            Room bk_Serv = new Room("1310", "Service room");
            Room bk_Terr = new Room("1320", "Terrace");
            
            lowRooms.add(low_Din);
            lowRooms.add(low_Liv);
            lowRooms.add(low_Kit);
            upRooms.add(up_Liv);
            upRooms.add(up_Kid);
            upRooms.add(up_Main);
            backyardRooms.add(bk_Serv);
            backyardRooms.add(bk_Terr);
        
        /*Creando Areas*/   
        List<Area> areas = new ArrayList<>();
            Area lowLevel = new Area("1100", "Low Level");
            Area upLevel = new Area("1200", "Up Level");
            Area backyard = new Area("1300", "Backyard");
        lowLevel.setRooms(lowRooms);
        upLevel.setRooms(upRooms);
        backyard.setRooms(backyardRooms);
        areas.add(lowLevel);
        areas.add(upLevel);
        areas.add(backyard);
        
        House house = new House("1000", "alex_house");
        house.setAreas(areas);
        
        /*Instanciar en admin´s*/
        AdminHouse adminHouse = new AdminHouse(house); //Al crear un nuevo AdminHouse se crea la configuracion inicial de la casa
        AdminDevice adminDevice = new AdminDevice(house,0);
        
        /*Crear dispositivos*/
        AC ac1 = new AC("1111", "Dining room AC", "LG", "F856975", false);
        Light light1 = new Light("0112", "Dining room light", "Phillips", "A1856978", false);
        TV tv2 = new TV("1121", "Low level Living room TV", "Sony", "S12902", false);
        AC ac2 = new AC("1122", "Low level Living room AC", "Panasonic", "D189756", false);
        
        /*Añadir dispositivos a las habitaciones*/
        adminDevice.addDevice(low_Din, ac1); //Añadir el aire del comedor al comedor
        adminDevice.addDevice(low_Din, light1); //Luz del comedor al comedor
        adminDevice.addDevice(low_Liv, ac2); //Aire de la sala de abajo a la sala de abajo
        adminDevice.addDevice(low_Liv, tv2); //Tv de la sala de abajo a la sala de abajo
        
        //Encender
        adminDevice.getHouse().getAreas().get(0).getRooms().get(0).getDevices().get(0).turnOn();
        adminDevice.getHouse().getAreas().get(0).getRooms().get(0).getDevices().get(1).turnOn();
        adminDevice.getHouse().getAreas().get(0).getRooms().get(1).getDevices().get(0).turnOn();
        adminDevice.getHouse().getAreas().get(0).getRooms().get(1).getDevices().get(1).turnOn();
        
        
        /*------------------------E V A L U A C I O N-----------------------------------------------------------------*/
       
        /*
        //Imprimir todos los dispositivos en la casa con su informacion
        System.out.println("Dispositivos en " + house.getName() + ":");
        System.out.println(adminDevice.toStringDevices());
        
        //Imprimir cuantos estan encendidos
        System.out.println("Dispositivos encendidos: " + adminDevice.howManyOn());
        
        //Apagar todo el comedor
        low_Din.switchEverything(false);
        System.out.println("Dispositivos encendidos: " + adminDevice.howManyOn());
        
        //Imprimir cuantos hay de cada tipo
        System.out.println("AC: " + AC.getInstancesAC());
        System.out.println("TV: " + TV.getInstancesTV());
        System.out.println("Lights: " + Light.getInstancesLight());
        
        
        /*-------------------------------------------------------------------------------------------------------------*/
        
        /*Probando Metodos CRUD
        Area nuevaArea = new Area("12345", "Area nueva");
        adminHouse.addArea(nuevaArea);
        System.out.println(house.toStringHouse()); 
        
        Room nuevoRoom = new Room("13123", "Habitacion nueva");
        adminHouse.addRoom(nuevaArea, nuevoRoom);
        System.out.println(house.toStringHouse());*/ 
        
        System.out.println(house.toStringDevicesinHouse());

    }
    
}
