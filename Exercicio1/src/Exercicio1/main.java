
package Exercicio1;
import java.util.*;
public class main
{
    public static void main (String[] args){
        
    Conta conta1 = new Conta(4872, 8080 ,0.0f, 300.00f);
    conta1.deposito(4);
    
    System.out.println("Deposito efetuado, novo valor é " + conta1.getSaldo());
}
    

    
    
    
}
