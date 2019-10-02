/**
 * practica_2_ex_2
 */

public class practica_2_ex_2 {

    public static void main(String[] args) {
        //2 - Demana a l'usuari una frase i el programa ha de quina és la longitud de la frase.

        System.out.print("escriu una frase : ");
        String cadena = System.console().readLine();
        
        
         
        for(int i = 0;i<cadena.length();i++)
        {
            System.out.println("la " + cadena + " la seva longitud es : " + i);
        }
        

    }
}