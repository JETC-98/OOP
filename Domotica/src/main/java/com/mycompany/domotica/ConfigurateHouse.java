/*
Todo lo relacionado al archivo txt de la disposición de la casa
*/

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
    
    /*Set y Get*/
    public void setHouse(House house){
        this.house = house;
    }
    public House getHouse(){
        return house;
    }
    
    /*Configuración inicial de la disposición de la casa*/
    public void initConfig(){
       
       String initData = house.toStringHouse().toString();
       File file = new File(house.getName() + ".txt");

       try{
           if (file.createNewFile()){
               System.out.println("Se ha creado la configuracion.");
           }else{
               System.out.println("El archivo de la configuracion ya existe.");
           }  

           try (FileWriter writer = new FileWriter(file)) {
               writer.write(initData);
           }

       }catch (IOException e){
           e.printStackTrace();
       }
    }
    
    /*Actualizar la disposición de la casa*/
    public void updateConfig(){
        
       String updatedData = house.toStringHouse().toString();
       File file = new File(house.getName() + ".txt");
       
       try{
           if(file.exists()){
               System.out.println("Se ha realizado la actualización");
           }else{
               System.out.println("No existe la configuración inicial, creando...");
               initConfig();
           }
           
           FileWriter exFile = new FileWriter(file.getAbsoluteFile()); //Obtener la información a actualizar
           try (BufferedWriter upFile = new BufferedWriter(exFile)) {
               upFile.write(updatedData); //Sobreescribir
           }
           
       }catch (IOException e){
           e.printStackTrace();
       }
    }
}
