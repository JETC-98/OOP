package com.mycompany.domotica;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ConfigurateHouse {

    House house;
    
    public ConfigurateHouse(House house){
        this.house = house;
    }
    
    /*Configuración inicial*/
    public void configCreate(){

       File file = new File("cfg.txt");

       try{
           if (file.createNewFile()){
               System.out.println("Se ha creado la configuracion.");
           }else{
               System.out.println("El archivo de la configuracion ya existe.");
           }  

           FileWriter writer = new FileWriter(file);
           writer.write((house.toStringHouse().toString()));
           writer.close();

       }catch (IOException e){
           e.printStackTrace();
       }
    } 
}
