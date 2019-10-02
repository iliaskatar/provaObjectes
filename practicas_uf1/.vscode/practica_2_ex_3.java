/**
 * practica_2_ex_3
 */
import java.util.Scanner;
public class practica_2_ex_3 {

    public static void main(String[] args) {
        //3 - Demana a l'usuari un número de l'1 al 20 i el programa ha de dir si és un número primer o no.


        Scanner scan = new Scanner(System.in);
        System.out.println("escriu un numero del 1 fins 20");
        int num = scan.nextInt();

        
        for(int i = 2; 1 < num; i++) 
        {
            if (num % i == 0) 
            { 
                System.out.println("el numero no es primer." + num);
            }
            else
            {
                System.out.println("el numero  es primer." + num);
            }
            break; 
        }
       
      
       
       
    }
}