
package ejerciciosn;
//Jhosep TS
//Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen,
//debe indicarlo.
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
     Scanner entrada=new Scanner (System.in);

double a,b,c; // coeficientes ax^2+bx+c=0
double x1,x2,d; // soluciones y determinante
 //Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. 
 //Si no existen,debe indicarlo.
System.out.println("Introduzca primer coeficiente (a):");
a=entrada.nextInt();
System.out.println("Introduzca segundo coeficiente: (b):");
b=entrada.nextInt();
System.out.println("Introduzca tercer coeficiente: (c):");
c=entrada.nextInt();
// calculamos el determinante
d=((b*b)-4*a*c);
    if(d<0)
System.out.println("No existen soluciones reales");
    else{
// queda confirmar que a sea distinto de 0.
// si a=0 nos encontramos una división por cero.
x1=(-b+Math.sqrt(d))/(2*a);
x2=(-b-Math.sqrt(d))/(2*a);
System.out.println("Solucion: " + x1);
System.out.println("Solucion: " + x2);
}

    }
    
}
