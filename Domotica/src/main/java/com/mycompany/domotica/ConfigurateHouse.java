package com.mycompany.domotica;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ConfigurateHouse {

    House house;
    
    public ConfigurateHouse(House house){
        this.house = house;
    }
    
    public void configCreate(){

       File file = new File("cfg.txt");
       //Crear el archivo

       try{
           if (file.createNewFile()){
               System.out.println("Se ha creado la configuracion.");
           }else{
               System.out.println("El archivo de la configuracion ya existe.");
           }  
           //Lo que sea que se tenga que escribir adentro
           FileWriter writer = new FileWriter(file);
           writer.write((house.toStringHouse().toString()));
           writer.close();

       }catch (IOException e){
           e.printStackTrace();
       }
    } 
}
