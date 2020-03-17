/*
 * Clase de calculadora con los métodos publicos para que puedan
   Ser llamados desde otro paquete
 */
package pClasesApoyo.pMates;

import java.util.ArrayList;

public class Calculadora_V2 {
    public ArrayList <Integer> enteros;
    
    public Calculadora_V2(){
        enteros=new ArrayList<>();
    }
    
    public int sumar(){
        int total=0;
        for(int x : enteros){
            total+=x;
        }
        
        return total;
    }
    public int menor(){
        int menor=0;
        boolean primero=true;
        
        for(int x : enteros){
            if(x<menor || primero){ 
                x=menor;
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
