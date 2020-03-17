/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pClasesApoyo;

/**
 *
 * @author User
 */
public class DadoFalso_v2 {
    public int lanzar(int n){
        int num = (int)(Math.random()*8) + 1;
        if (num==n || num >=7) return n;
        else return num;
    }
}
