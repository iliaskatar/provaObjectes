/**
 * exemple_1
 */
import java.io.Console;
import java.text.ParsePosition;
import java.util.Random;
public class exemple_1 {

    public static void main(String[] args) {
       /* 
       System.out.println("          array bidimensional java      ");
        Random ran = new Random();
        int array[][]=new int[3][4];

        
        for(int i =0;i<array.length;i++)
        {
            System.out.print("\n");
            for(int j =0;j<array[0].length;j++)
            {
                array[i][j] = ran.nextInt(10);
                System.out.print("\t" + array[i][j]);
            }
        }
        System.out.println();
        */

        


       /* System.out.println("taula de multiplicacio ");

        System.out.println(" escriu un numero ");
        int usuari = Integer.parseInt(System.console().readLine());
        int array[] = new int [11];

        int i =10;
        for(int i =0;i<array.length;i++)
        {
            array[i] = usuari * i;
            System.out.println(usuari + " * " + i + " = " +array[i]);
        }
        
        while(i<array.length)
        {
            array[i] = usuari * i; 
            System.out.println(usuari + " * " + i + " = " +array[i]);
            --i;
        }*/
        
        /*
        System.out.println("                    -------------------                       ");
        System.out.println("                     adivina el numero                        ");
        System.out.println("                    ------------------- \n                      ");

        Random ran = new Random();
        
        int usuari;
        int numero;
        int intents =0;
        boolean parar = false;
        numero = ran.nextInt(10);
        while(!parar)
        {
           
            System.out.println(" Escriu un numero ");
            usuari = Integer.parseInt(System.console().readLine());
            
            if(usuari == numero)
            {
                
                System.out.println(" Correcta.... El numero guanyador es : " + numero );
                parar = true;
            }
            else
            {
                
                System.out.println(" INCORRECTA.... itenta de nou   " );
                
            }
            intents++;

        }
        System.out.println("las vegades que ho has intentat es : " + intents);
        */

        //Calcula el factorial d'un nombre demanat per teclat


        /*
        System.out.println("numero facturial");
        int numero = Integer.parseInt(System.console().readLine());
        int facturial=1;

        System.out.println("tots el numeros facturial");
        for(int i =numero;i>0;i--)
        {
            facturial =facturial*i;
            System.out.println(facturial);
        }*/
        //2 - Suma els parells i els senars fins a un nombre demanat per teclat

        System.out.println("suma de parells i els senars");
        int numero = Integer.parseInt(System.console().readLine());

         int suma_parell =0;
         int suma_sanar =0;
         

         for(int i =1;i<(numero+1);i++)
         {
            if(i%2==0)
            {
               suma_parell = suma_parell + i;
               System.out.println("el numero  " + i + " La suma dels parells son : " + suma_parell);
            }
            else
            {
                suma_sanar=suma_sanar+i;
                System.out.println("el numero  " + i + " la suma dels numeros sanars son : " + suma_sanar);
            }
         }
         

        




       /* 
        System.out.println("          BINGO        ");
        Random ran = new Random();
        int array[][]=new int[3][10];
        int arrray1 [][]= new int[4][4];

        for(int i =0;i<array.length;i++)
        {
        
            System.out.print("\n");
            for(int j =0;j<array[0].length;j++)
            {   
                array[i][j] = (int) ran.random(10) + 10 * j ;
                //array[i][j]=ran.nextInt(90);

                System.out.print("\t" + array[i][j]);
            }
        }
        System.out.println();
*/

        



    }
}