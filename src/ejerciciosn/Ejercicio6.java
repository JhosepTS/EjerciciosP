
package ejerciciosn;
//Jhosep TS
//6. Pedir dos números y decir si uno es múltiplo del otro.

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner Entrada=new Scanner (System.in);
  int n1,n2;
 System.out.print("Introduce un número: ");
 n1=Entrada.nextInt();
 System.out.print("Introduce otro número: ");
 n2=Entrada.nextInt();
  if(n1%n2==0)
 System.out.println("Son múltiplos");
 else
 System.out.println("No son múltiplos");

    }
    
}
