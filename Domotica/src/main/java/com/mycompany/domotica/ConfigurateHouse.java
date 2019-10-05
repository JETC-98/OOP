package com.mycompany.domotica;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class ConfigurateHouse {

    private House house;
    
    /*Constructores*/
    public ConfigurateHouse(House house){
        this.house = house;
    }
    public ConfigurateHouse(){}
    
    
    /*Configuración inicial de la disposición de la casa*/
    public void initConfig(){

       File file = new File("cfg.txt");

       try{
           if (file.createNewFile()){
               System.out.println("Se ha creado la configuracion.");
           }else{
               System.out.println("El archivo de la configuracion ya existe.");
           }  

           try (FileWriter writer = new FileWriter(file)) {
               writer.write((house.toStringHouse().toString()));
           }

       }catch (IOException e){
           e.printStackTrace();
       }
    }
    
    /*Actualizar la disposición de la casa*/
    public void updateConfig(){
        
       String updatedData = house.toStringHouse().toString();
       File file = new File("cfg.txt");
       
       try{
           if(file.exists()){
               System.out.println("Se ha realizado la actualización");
           }else{
              initConfig();
               System.out.println("No existe la configuración inicial, creando...");
           }
           
           FileWriter exFile = new FileWriter(file.getAbsoluteFile());
           try (BufferedWriter upFile = new BufferedWriter(exFile)) {
               upFile.write(updatedData);
           }
           
       }catch (IOException e){
           e.printStackTrace();
       }
    }
}
