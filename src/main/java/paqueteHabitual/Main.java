/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteHabitual;
import pClasesApoyo.pMates.*;
/**
 *
 * @author User
 */
public class Main{
    public static void main(String[]args){
        //CALCULADORA
        // Podemos llamar al metodo media ya que es público. Al resto no es posible, ya que no son visibles
        // Creo Calculadora_V2 para subsanar el problema
        
        Calculadora_V2 calc = new Calculadora_V2();
        calc.enteros.add(1);
        calc.enteros.add(2);
        calc.enteros.add(5);
        calc.enteros.add(25);
        
        System.out.println("La media es: " + calc.media());
         System.out.println("La suma es: " + calc.sumar());
        System.out.println("El menor es: " + calc.menor());
        
        
        
    }
}
