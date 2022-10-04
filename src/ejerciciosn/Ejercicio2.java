
package ejerciciosn;
//2. Pedir el radio de un círculo y calcular su área. A=PI*r^2.

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
      double a,r; // área y radio
        Scanner Entrada=new Scanner (System.in);
 System.out.print("Introduce el radio de un circulo: ");
 r=Entrada.nextInt();
 a=Math.PI*(r*r); // para elevar al cuadrado otra opción es: Math.pow (r, 2)
 
 System.out.println("El área de una circunferencia de radio " + r+ " es: " + a);
    }
    
}
