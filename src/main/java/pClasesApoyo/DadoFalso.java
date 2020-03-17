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
class DadoFalso {
    public int lanzar(int n){
        int num = (int)(Math.random()*10) + 1;
        if (num==n || num >=7) return n;
        else return num;
    }
}
