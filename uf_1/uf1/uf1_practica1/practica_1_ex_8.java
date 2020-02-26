/**
 * practica1_ex_8
 */
import java.util.Random;
public class practica_1_ex_8 {

    public static void main(String[] args) {
        
        Random rnd = new Random();
        int numeroAleatori = rnd.nextInt(10);
        System.out.println(" el numero premiat es : " + numeroAleatori);
       
        boolean trobat = false;
        int[] sorteig = new int[10];
        int intents = 0;
        for(int i= 0;i<sorteig.length;i++)
        {
            sorteig[i]=2000;
        }
        while(trobat == false)
        {
            int numeroPremiat = rnd.nextInt(10);
            boolean concidencia = false;

            for(int x = 0; x<sorteig.length;x++)
            {
                if(numeroPremiat == sorteig[x] )
                {
                    trobat = true;
                    break;
                }
            }
            if(!concidencia)
            {
                sorteig[intents]=numeroPremiat;
                intents++;
                if(numeroPremiat == numeroAleatori)
                {
                    trobat = true;

                }
            }
            else
            {
                System.out.println(" el numero ja hi era");
            }
        }
        System.out.println("el numero D'intents es " + intents);
    }
}