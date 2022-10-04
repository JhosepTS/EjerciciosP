
package ejerciciosn;
//Jhosep TS
//3. Pedir el radio de una circunferencia y calcular su longitud.

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner Entrada=new Scanner (System.in);
      double l,r; // longitud y radio
 System.out.print("Introduce el radio de una circunferencia: ");
 r=Entrada.nextInt();
 l=2*Math.PI*r;
 
 System.out.println("La longitud de una circunferencia de radio " + r+ " es: " + l);
    }
    
}
