/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erd.parser;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Polinesios
 */
public class ERDfacade { 
     
       ERDParser pr;
  
       public ERDfacade() throws FileNotFoundException{
        pr= new ERDParser("university-erd.json");
        pr.Entidadesfuertes();
        pr.Entidadesdebiles();
        pr.crearTablas();
       }
         
     void vernombres(){
         pr.verlistatablas();
     }
     
     void vertablas(){
         pr.vertablas();
     }
     void vertabla(String nombre){
         String n=nombre;
         pr.vertabla(n);
     }
           
}
