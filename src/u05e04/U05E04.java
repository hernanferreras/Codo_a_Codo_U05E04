
package u05e04;

import java.util.Scanner;

public class U05E04 {
    
    public static void main(String args[]) {
       Scanner entrada=new Scanner(System.in);
       int num1;
       double cubo;
       System.out.print("Ingrese un numero: ");
       num1=entrada.nextInt();
       cubo=calculaCubo(num1);
       System.out.print("El cubo del numero "+num1+" es: "+cubo);
    }
    static double calculaCubo (int b){
        double a=Math.pow(b,3);
        return(a);
    }
}
   