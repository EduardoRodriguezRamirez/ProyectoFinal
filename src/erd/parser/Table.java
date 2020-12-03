/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erd.parser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author HP
 */
public class Table {
    
    public static final char DK_CHAR = '-';
    public static final char PK_CHAR = '+';
    public static final char FK_CHAR = '*';
    public static final char SINGLE_CHAR = '@';
    
    public static final int SINGLE = '@';
    public static final int DK = '-';
    public static final int PK = '+';
    public static final int FK = '*';
    
    String name;
    private String primaryKey=null;
    private HashSet<String> LLaveP;
    private HashSet<String> LLaveF;
    private HashSet<String> LLaveC;
    
    ArrayList<String> atributes;

    public Table(){
        name="";
        primaryKey=null;
        LLaveP=new HashSet<>();
        LLaveF=new HashSet<>();
        LLaveC=new HashSet<>();
        atributes = new ArrayList<String>();
    }
    
    public Table(String n){
        name= n;
        primaryKey=null;
        LLaveP = new HashSet<>();
        LLaveF=new HashSet<>();
        LLaveC=new HashSet<>();
        atributes = new ArrayList<String>();
    }
    
    public boolean setPK(String pk){
        return LLaveP.add(pk);
    }
    public boolean isPK(String a){
        return LLaveP.contains(a);
    }
    public boolean setDK(String pk){
        return LLaveC.add(pk);
    }
    public boolean isDK(String a){
        return LLaveC.contains(a);
    }
     public boolean setFK(String Fk){
        return LLaveF.add(Fk);
    }
    public boolean isFK(String F){
        return LLaveF.contains(F);
    }
    public boolean add(String a){
        boolean result = false;
        if(a!=null){
            if(!atributes.contains(a)){
                result = atributes.add(a);
            }
        }
        return result;
    }
    public boolean remove(String a){
        return atributes.remove(a);
    }
    public static String attribName(String a){
        return a.substring(1);
    }
    public static int attribType(String a){
        return a.charAt(0);
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(name);
        sb.append("(");
        
        Iterator it= atributes.iterator();
        int n =atributes.size();
        
        for(int i=0;i<n;i++){
            String a = (String) it.next();
            sb.append(a);
            if( isPK(a)){
                sb.append("+");
            }
            if( isFK(a)){
                sb.append("*");
            }
            if( isDK(a)){
                sb.append("-");
            }
            if(i<n-1){
                sb.append(",");
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
