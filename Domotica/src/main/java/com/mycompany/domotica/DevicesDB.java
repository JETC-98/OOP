
package com.mycompany.domotica;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class DevicesDB {
    
    private House house;
    
    /*Constructor*/
    public DevicesDB(House house){
        this.house = house;
    }
    
    /*Set y Get*/
    public void setHouse(House house){
        this.house = house;
    }
    public House getHouse(){
        return house;
    }
    
    /*Crear BD de los dispositivos*/
    public void createDB(){
        
        String initDB = house.toStringDevicesinHouse().toString();
        File DB = new File(house.getName() + "_devices.txt");
        
        try{
            if(DB.createNewFile()){ //Si no se ha creado el archivo
                System.out.println("Se ha creado la BD");
            }else{
                System.out.println("La BD ya existe");
            }
            
            try(FileWriter file = new FileWriter(DB)){
                file.write(initDB);
            }
            
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    
    /*Actualizar BD de los dispositivos*/
    public void updateDB(){
        
        String updatedDB = house.toStringDevicesinHouse().toString();
        File DB = new File(house.getName() + "_devices.txt");
        
        try{
            if(DB.exists()){
                System.out.println("Se ha realizado la actualización");
            }else{
                System.out.println("No existe la BD, creando...");
                createDB();
            }
            
            FileWriter exDB = new FileWriter(DB.getAbsoluteFile()); //Obtener la BD a actualizar
            try (BufferedWriter upDB = new BufferedWriter(exDB)) { 
                upDB.write(updatedDB); //Sobreescribir
            }
            
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
