
//No podemos hacer super.sumar, ya que es privado y solo lo puede ver la propia clase
// No hay Override, no sabe que existe el metodo en el padre

package pClasesApoyo.pMates;

public class CalculadoraPro_V2 extends Calculadora{
    public String sumar(){
        return Integer.toHexString(20);
    }
   
    
    // Podemos hacer super.menor() ya que el metodo es visible, al ser protected los hijos lo pueden usar
    // Hay Override
    @Override
    public int menor(){
        int menor=super.menor();
        
        if(menor<0)
            return 0;
        else return menor;
    }
}
