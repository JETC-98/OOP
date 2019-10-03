
package com.mycompany.domotica;

public class Main {
    
    public static void main(String[] args) {
        
        
        Device[] devices_low1 = new Device[2];
            AC ac1 = new AC("1111", "Dining room AC", "LG", "F856975");
            Light light1 = new Light("0112", "Dining room light", "Phillips", "A1856978");
         Device[] devices_low2 = new Device[2];
            TV tv2 = new TV("1121", "Low level Living room TV", "Sony", "S12902");
            AC ac2 = new AC("1122", "Low level Living room AC", "Panasonic", "D189756");
        
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
        low1.SetDevices(devices_low1);
        low2.SetDevices(devices_low2);
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
    }
    
}
