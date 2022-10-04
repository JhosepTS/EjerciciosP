
package ejerciciosn;
//Jhosep TS
//9. Pedir dos números y mostrarlos ordenados de mayor a menor

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner Entrada=new Scanner (System.in); 
 int n1,n2;
 System.out.print("Introduce un número: ");
 n1=Entrada.nextInt();
 System.out.print("Introduce otro número: ");
 n2=Entrada.nextInt();
 
 if(n1>n2)
 System.out.println(n1 + " y " + n2);
 else
 System.out.println(n2 + " y " + n1); 
    }
    
}
