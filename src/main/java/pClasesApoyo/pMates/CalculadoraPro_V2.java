
package pClasesApoyo.pMates;

public class CalculadoraPro_V2 extends Calculadora{
    public String sumar(){
        return Integer.toHexString(20);
    }
   
    @Override
    public int menor(){
        int menor=super.menor();
        
        if(menor<0)
            return 0;
        else return menor;
    }
}
