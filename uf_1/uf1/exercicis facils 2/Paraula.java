/**
 * Paraula
 */
import java.util.Random;

//import sun.security.util.Length;
public class Paraula {

    public static void main(String[] args) {
        String usuari = " ";
        String usuari1 = " ";
        
        //String[][] arraypunts= new int [2][5];

        int intents= 0;
        int intents1= 0;
        int numero =5;
        int s = 4;
        boolean stop=false;
        boolean stopi=false;
        int punts=0;
        int punts1=0;
        System.out.println("----------------------------------");
        System.out.println("             CADENA               ");
        System.out.println("----------------------------------");
        System.out.println(" escriu el primer nom ");
        String nom = System.console().readLine();
        System.out.println(" escriu el segon nom ");
        String nom1 = System.console().readLine();

        Random rng = new Random();
        String maquina = "BCDFGHJKLMNPQRSTVWXYZ";
        String vocals = "AEIOU";
        String lletra = " ";
        
       maquina= FraseAleatori(rng, maquina, numero);
       vocals= FraseAleatori(rng, vocals, s);


       
        
        while(!stop){
            System.out.println("----------------------------------");
            System.out.println("\t" + maquina + vocals);
            System.out.println("----------------------------------");
            System.out.println(nom + " et toca ");
            cadena(usuari);
            if(usuari.equals(maquina)&&usuari.equals(vocals)){
                System.out.println(" es correcta");
                punts++;
            }
            else if(intents == 2){
                System.out.println(" GAME OVER ");
                stop=true;
                break;
            }
            else{
                intents++;
                System.out.println(" incorecta, intentau de nou");
            }
        } 

       

        while(!stopi){
            System.out.println("----------------------------------");
            System.out.println("\t" + maquina + vocals);
            System.out.println("----------------------------------");
            System.out.println(nom1 + " et toca  ");
            cadena(usuari1);
            if(usuari1.equals(maquina)&&usuari1.equals(vocals)){
                System.out.println(" es correcta");
                punts1++;
            }
            else if(intents1 == 2){
                System.out.println(" GAME OVER ");
                stopi=true;
                break;
            }
            else{
                intents1++;
                System.out.println(" incorecta, intentau de nou");
            }
        }

        System.out.println("\n");
        System.out.println(nom + " has obtingut " + punts + " punts ");
        System.out.println(nom1 + " has obtingut " + punts1 + " punts ");


    }
    public static void cadena (String paraula){
        System.out.println("escriu una paraula");
        paraula = System.console().readLine();
        System.out.println("escriu una frase " + paraula );
       
    }
    public static String FraseAleatori (Random rng, String maquina, int length){
       
        char[] text = new char[length];
        for (int i = 0; i < length; i++)
        {
            text[i] = maquina.charAt(rng.nextInt(maquina.length()));
        }
       
        return new String(text);
    }
    public static void noms (){

    }
 

}