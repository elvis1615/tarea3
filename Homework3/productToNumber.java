
import java.util.Scanner;

/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/

public class productToNumber {   

   public static void main(String[] args) {

        Scanner recibir=new Scanner(System.in);
        int rec;
        System.out.println("ingrese el numero");
        rec=recibir.nextInt();
        int resultado = 0;
        //System.out.println(args[0]);

        for(int i=rec;i>0;i--){
            int seg=i;
            if(i==rec){
                resultado=i;
            }
            else{
                resultado=resultado*seg;
            }
        }
        System.out.println("el producto es: "+resultado);

    }

}