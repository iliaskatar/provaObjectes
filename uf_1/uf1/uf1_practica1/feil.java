/**
 * feil
 */
import java.lang.reflect.Array;
import java.util.Scanner;
public class feil {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int numero4 = 0;
        int numero5 = 0;
        boolean para = false;
        int opccio = 0;

        while(para == false){
           
           
            if (opccio == 0)
            {
                opccio++;
                System.out.println("intrudueix el primer número:");			
                numero1 = reader.nextInt();
                System.out.println("intrudueix el primer número:");			
                numero1 = reader.nextInt();
                System.out.println("intrudueix el segundo número:");
                numero2 = reader.nextInt();
                System.out.println("intrudueix el tercer número:");			
                numero3 = reader.nextInt();
                System.out.println("intrudueix el quart número:");
                numero4 = reader.nextInt();
                System.out.println("intrudueix el cinque número:");			
                numero5 = reader.nextInt();
                if(opccio == 1)
                {
                    para = true;
                }
            }
            else
                {
                    para = true;
                }
               
        }
        int resultado = numero1+numero2+numero3+numero4+numero5;
        System.out.println("La suma es " + numero1 + " + " + numero2 + " + " + numero3 + " + " + numero4 + " + " + numero5 + " = " + resultado);

    }
}