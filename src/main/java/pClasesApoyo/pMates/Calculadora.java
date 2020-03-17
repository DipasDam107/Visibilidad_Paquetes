/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pClasesApoyo.pMates;

import java.util.ArrayList;

public class Calculadora {
    public ArrayList <Integer> enteros;
    
    public Calculadora(){
        enteros=new ArrayList<>();
    }
    
    private int sumar(){
        int total=0;
        for(int x : enteros){
            total+=x;
        }
        
        return total;
    }
    protected int menor(){
        int menor=0;
        boolean primero=true;
        
        for(int x : enteros){
            if(x<menor || primero){ 
                menor=x;
                primero=false;
            }
        }
        
        return menor;
        
    }
    public float media(){
        int total=0;
        for(int x : enteros){
            total+=x;
        }
        
        return (float)total/(float)enteros.size();
    }
}
