
package vista;

import java.util.Scanner;
import model.Alumno;
import model.Numero;
import model.Valores;


public class principal 
{
 static Numero n1;
 static Alumno a1;
 static Valores z;
  static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
        nuevoN();
        agregar();
 
       
    }
    public static void agregar(){
        a1=new Alumno("reyes","maria",17,"La Alameda");
        System.out.println("Datos de Alumno");
        System.out.println("_______________");
        System.out.println(a1.getApellidos()+" "+a1.getNombre()+" "+a1.getEdad()+"");
    }
    public static void nuevoN()
    {
        n1=new Numero(1);

        System.out.println(n1.getN());
    }
    public static void obtenerDatos()
    {
        int x; int a[];
        System.out.println("Numero de elementos: ");
        x = scanner.nextInt();
        a = new int[x];
        System.out.println("\nIngresar"+ x + " numeros:");
        System.out.println("---------------------------");
        for(int i=0;i<a.length;i++){
            a[i]=scanner.nextInt();
        }
        System.out.println("La suma es: "+ z.sumaValores());
        System.out.println("El mayor es: "+ z.mayorN());

    }
}
