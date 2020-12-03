/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erd.parser;

import java.io.FileNotFoundException;

/**
 *
 * @author Polinesios
 */
public class Principal_parser {
    public static void main(String[] args) throws FileNotFoundException {
       ERDfacade fc=new ERDfacade ();
       fc.vernombres();
       fc.vertablas();
       fc.vertabla("Class");
    }
}
