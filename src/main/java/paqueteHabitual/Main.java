/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteHabitual;
import pClasesApoyo.pMates.*;
import pClasesApoyo.*;
import static pClasesApoyo.Dado_v2.*;
import static java.lang.Math.*;
/**
 *
 * @author User
 */
public class Main{
    public static void main(String[]args){
        //CALCULADORA
        /*
        Realiza un programa (en el paquete en el que trabajas habitualmente) que emplee los
        métodos de Calculadora (primero creando una instancia con un ArrayList con unos valores
        cualquiera) y luego llamando a sus tres métodos. Comenta los problemas de acceso que te
        encuentres y sus causas.
        */
        // Podemos llamar al metodo media ya que es público. Al resto no es posible, ya que no son visibles
        // Creo Calculadora_V2 para subsanar el problema
        
        Calculadora_V2 calc = new Calculadora_V2();
        calc.enteros.add(1);
        calc.enteros.add(2);
        calc.enteros.add(5);
        calc.enteros.add(25);
        
        System.out.println("\n\n\n---------------------------");
        System.out.println("CALCULADORA");
        System.out.println("---------------------------");
        System.out.println("La media es: " + calc.media());
        System.out.println("La suma es: " + calc.sumar());
        System.out.println("El menor es: " + calc.menor());
        
        //CALCULADORAPRO
        /*
        Realiza un programa (en el paquete en el que trabajas habitualmente) que emplee los
        métodos de CalculadoraPro (primero creando una instancia con un ArrayList con unos valores
        cualquiera) y luego llamando a sus tres métodos. Comenta los problemas de acceso y sus causas. 
        */
        
        //No podriamos instanciar la clase CalculadoraPro, ya que no es visible desde otro paquete (default).
        //Creo una clase con las mismas caracteristicas pero subsanando estos defectos.
        //Aqui si que podriamos usar los métodos de la clase Calculadora, ya que la clase hija los puede ver, al estar en el mismo paquete.
        
        CalculadoraPro_V2 calcPro = new CalculadoraPro_V2();
        
        calcPro.enteros.add(1);
        calcPro.enteros.add(2);
        calcPro.enteros.add(5);
        calcPro.enteros.add(25);
        System.out.println("\n\n\n---------------------------");
        System.out.println("CALCULADORA PRO");
        System.out.println("---------------------------");
        System.out.println("La media es: " + calcPro.media());
        System.out.println("La suma es: " + calcPro.sumar());
        System.out.println("El menor es: " + calcPro.menor());
    
        // Dado y Dado Falso
        /*
        Realiza un programa (en el paquete en el que trabajas habitualmente) que emplee los
        métodos lanzar() de la clase Dado y DadoFalso. ¿Algún problema de acceso? Enumera distintas
        formas de solucionarlo: ¿cambiando el acceso a las clases? ¿cambiando de paquete el ejercicio? 
        */
        Dado dado = new Dado();
        System.out.println("\n\n\n---------------------------");
        System.out.println("DADO");
        System.out.println("---------------------------");
        System.out.println("Tirada 1: " + dado.lanzar());
        System.out.println("Tirada 2: " + dado.lanzar());
        System.out.println("Tirada 3: " + dado.lanzar());
        System.out.println("Tirada 4: " + dado.lanzar());
        System.out.println("Tirada 5: " + dado.lanzar());
        System.out.println("Tirada 6: " + dado.lanzar());
        
        
        //Con DadoFalso tendriamos problemas de acceso, no es visible, ya que es default y está en otro paquete.
        //Subsano este problema haciendo la clase publica (DadoFalso_v2), aunque se podria poner la clase manteniendo permisos en el mismo paquete que este archivo.
        DadoFalso_v2 dadoFalso = new DadoFalso_v2();
        System.out.println("\n\n\n---------------------------");
        System.out.println("DADO FALSO");
        System.out.println("---------------------------");
        int numero = 3;
        
        System.out.println("Tirada 1: " + dadoFalso.lanzar(numero));
        System.out.println("Tirada 2: " + dadoFalso.lanzar(numero));
        System.out.println("Tirada 3: " + dadoFalso.lanzar(numero));
        System.out.println("Tirada 4: " + dadoFalso.lanzar(numero));
        System.out.println("Tirada 5: " + dadoFalso.lanzar(numero));
        System.out.println("Tirada 6: " + dadoFalso.lanzar(numero));
        
        // AREA CON DADO
        /*
        Realiza un programa que utilizando el método lanzar() de la clase Dado anterior y la constante
        PI de la clase Math, simule que lanzamos un dado y muestre el área del círculo que tuviera por radio
        el valor obtenido en el dado. Ejemplo: si sale en el dado un 3, el área sería 3* 3 * PI. Se pide que no
        haga falta añadir el prefijo con la clase ni al método lanzar() ni a la constante PI.
        */
        
        //Hay que hacer imports estáticos del metodo estático lanzar del Dado_v2 y de java.lang.Math.*
        int lanzado = lanzar();
        System.out.println("\n\n\n---------------------------");
        System.out.println("AREA");
        System.out.println("---------------------------");
        System.out.println("Ha salido el numero " + lanzado);
        System.out.println("El Area es: " + (pow(lanzado, 2)*PI));
        
        
    }
}
