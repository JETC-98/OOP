
package com.mycompany.domotica;

public class Main {
    
    public static void main(String[] args) {
        
        /*Informacion de la casa*/
         Room[] lowRooms = new Room[3];
            Room low1 = new Room("1110", "Dining room");
            Room low2 = new Room("1120", "Living room");
            Room low3 = new Room("1130", "Kitchen");
        Room[] upRooms = new Room[3];
            Room up1 = new Room("1210", "Up Level living room");
            Room up2 = new Room("1220", "Kid's bedroom");
            Room up3 = new Room("1230", "Main bedroom");
        Room[] bkyardRooms = new Room[2];
            Room bk1 = new Room("1310", "Service room");
            Room bk2 = new Room("1320", "Terrace");
            lowRooms[0] = low1;
            lowRooms[1] = low2;
            lowRooms[2] = low3;
            upRooms[0] = up1;
            upRooms[1] = up2;
            upRooms[2] = up3;
            bkyardRooms[0] = bk1;
            bkyardRooms[1] = bk2;
        
        Area[] areas = new Area[3];
            Area lowLevel = new Area("1100", "low Level");
            Area upLevel = new Area("1200", "up Level");
            Area backyard = new Area("1300", "backyard");
        lowLevel.setRooms(lowRooms);
        upLevel.setRooms(upRooms);
        backyard.setRooms(bkyardRooms);
        areas[0] = lowLevel;
        areas[1] = upLevel;
        areas[2] = backyard;
        
        House house = new House("1000", "alex_house");
        house.setAreas(areas);
        
        /*Instanciar en admin´s*/
        AdminHouse adminHouse = new AdminHouse(house);
        AdminDevice adminDevice = new AdminDevice(house,0);
        
        /*Configuración inicial de la casa*/
        ConfigurateHouse config = new ConfigurateHouse(house);
        //config.configCreate();
        
        /*Crear dispositivos*/
        AC ac1 = new AC("1111", "Dining room AC", "LG", "F856975", false);
        Light light1 = new Light("0112", "Dining room light", "Phillips", "A1856978", false);
        TV tv2 = new TV("1121", "Low level Living room TV", "Sony", "S12902", false);
        AC ac2 = new AC("1122", "Low level Living room AC", "Panasonic", "D189756", false);
        
        /*Añadir dispositivos a las habitaciones*/
        adminDevice.addDevice(low1, ac1); //Añadir el aire del comedor al comedor
        adminDevice.addDevice(low1, light1); //Luz del comedor al comedor
        adminDevice.addDevice(low2, ac2); //Aire de la sala de abajo a la sala de abajo
        adminDevice.addDevice(low2, tv2); //Tv de la sala de abajo a la sala de abajo
        
        //Encender
        adminDevice.getHouse().getArea(0).getRoom(0).getDevices().get(0).turnOn();
        adminDevice.getHouse().getArea(0).getRoom(0).getDevices().get(1).turnOn();
        adminDevice.getHouse().getArea(0).getRoom(1).getDevices().get(0).turnOn();
        adminDevice.getHouse().getArea(0).getRoom(1).getDevices().get(1).turnOn();
        
        //Imprimir todos los dispositivos en la casa con su informacion
        System.out.println("Dispositivos en " + house.getName() + ":");
        System.out.println(adminDevice.toStringDevice());
        
        //Imprimir cuantos estan encendidos
        System.out.println("Dispositivos encendidos: " + adminDevice.howManyOn());
        
        //Apagar todo el comedor
        low1.switchEverything(false);
        System.out.println("Dispositivos encendidos: " + adminDevice.howManyOn());
        
        //Imprimir cuantos hay de cada tipo
        System.out.println("AC: " + AC.getInstancesAC());
        System.out.println("TV: " + TV.getInstancesTV());
        System.out.println("Lights: " + Light.getInstancesLight());
    }
    
}
