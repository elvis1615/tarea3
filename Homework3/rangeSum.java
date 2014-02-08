/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/
import java.util.Scanner;

public class rangeSum {   

   public static void main(String[] args) {

       Scanner recibir=new Scanner(System.in);
       int rec1, rec2;
       System.out.println("introduzca primer numero");
       rec1=recibir.nextInt();

       System.out.println("introdusca segundo numero");
       rec2=recibir.nextInt();
       while(rec2<rec1)
       {
           System.out.println("introduzca segundo numero que sea mayor al primero");
           rec2=recibir.nextInt();
       }


       //System.out.println("limites: "+args[0]+" "+args[1]);
       for(int i=rec1; i<=rec2;i++)
       {
           System.out.println("numero actual es:"+i );
       }



   }

}