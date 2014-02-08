public class FlipFlop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   		int numeroActual = 0;
   		//System.out.println(args[0]);

       /*if(numeroActual==0){
           System.out.println(numeroActual);
       }*/
      if(numeroActual%3==0 && numeroActual%5!=0 && numeroActual!=0)
       {
   		// si el numero es divisible dentro de 3 imprima "Flip"
			System.out.println("Flip");
       }


   		if (numeroActual%3!=0 && numeroActual%5==0 && numeroActual!=0)
        {
   		// si el numero es divisible dentro de 5 imprima "Flop"
			System.out.println("Flop");
        }
       if(numeroActual%5==0 && numeroActual%3==0 && numeroActual!=0)
       {
   		// si el numero es divisible dentro de 3 y 5 imprima "FlipFlop"
			System.out.println("FlipFlop");
       }
       else{
   		// de lo contrario, imprima el numero
      		System.out.println(numeroActual);
       }
}
        // TODO code application logic here
    }
