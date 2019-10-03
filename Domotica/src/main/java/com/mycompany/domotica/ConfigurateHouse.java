package com.mycompany.domotica;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author amc
 */
public class ConfigurateHouse 
{    
    
 public static void configCreate() 
 {
  File file = new File("cfg.txt");
  //Crear el archivo
  try 
  {
   if (file.createNewFile()) 
   {
    System.out.println("Se ha creado la configuracion.");
   } 
   else
   {
    System.out.println("El archivo de la configuracion ya existe.");
   }
            
   //Lo que sea que se tenga que escribir adentro
   FileWriter writer = new FileWriter(file);
   writer.write("CONFIGURACION AQUI");
   writer.close();
  } catch (IOException e) {e.printStackTrace();}
 }
    
}
