/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero mayor a cero, imprima el valor actual desde cero hasta antes de llegar dado valor.

*/
import java.util.Scanner;

public class whileValue {

    public static void main(String[] args) {
        Scanner nuevo= new Scanner(System.in);
        int valorActual;
        System.out.println("Ingrese el numero");
        valorActual=nuevo.nextInt();

        //System.out.println(args[0]);

        //si valor actual < args[0]
        while(valorActual>0){
            for(int i=1;i<=valorActual;i++){
                System.out.println("el valor actual es: "+i);
            }
            break;
        }
    }
}

}