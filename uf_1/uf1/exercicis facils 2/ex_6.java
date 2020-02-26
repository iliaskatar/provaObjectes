

/**
 * ex.6
 */
import java.util.Scanner;
 
public class ex_6 {

    public static void main(String[] args) {
        //6 - Demana números per teclat fins a un màxim especificat  per teclat. 
        //Es demanen i es guarden en una matriu els números fins que es respongui "x" o arribi al màxim. 
        //Finalment s'imprimeixen en ordre i es demana un número per cercar.
        // si està s'imprimeix la posició d'aquest nombre en l'array.

        //Scanner s = new Scanner(System.in);
        
        boolean stop = false;
        int a =  0;
        int [] array = new int [10];

        while(!stop){
            
            System.out.println("escriu tots els numeros que volguis del 0 fins el 10");
            int numero = Integer.parseInt(System.console().readLine());
            if(numero <=10 ){
                boolean x = false;
                while(!x){
                    System.out.println(" vols escriura unaltre numero? si/no");
                    String lletra = System.console().readLine();
                    if(lletra.equals("si")){
                        x= true;
                        for (int i = 0; i < array.length; i++) {  
                            array[i] = numero;
                            if(array[i]==numero){
                                array[i] = numero;
                                
                            }     
                            x=true;
                        }
                    }
                     if(lletra.equals("no")){
                         for (int i = 0; i < array.length; i++) {
                            System.out.println("els numeros que ha escrit son : " + array[i]); 
                         }
                        x= true;
                        stop= true;                         
                    }
                    else{
                        System.out.println(" escriu si o no ");
                    }

                }
                
            }
           
            else{
                System.out.println("ei ei ei te dit un numero 0 al 10");
            }
        }

        //System.out.println("els numeros que ha escrit son : " + array[a]);

        
    }
}