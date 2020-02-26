/**
 * ex_5
 */
import java.util.Random;
public class ex_5 {

    public static void main(String[] args) {
       
        boolean parar = false;
        System.out.println("joc pedra, paper o tisores \n");
        System.out.println("comensa usuari");

        int punts_maquina =0;

        int punts_usuari = 0;
        
        System.out.println("escriu lo que vols tirar ");
        String usuari = System.console().readLine();
        //Random rnd = new Random();
       
        System.out.println("li toca tirar maquina");
        //int [] maquina = new Random(1, 3, 2);

        int  maquina = 1;
        //maquina = rnd.Random();
        while(!parar)
        {
           // System.out.println("escriu lo que vols tirar ");
            //usuari = System.console().readLine();
            //System.out.println("li toca tirar maquina");
           
            //maquina = rnd.Random();

            if(usuari.equalsIgnoreCase("pedra") && maquina ==3 )
            {
                punts_maquina++;
                punts_usuari--;
                System.out.println("guanya la maquina " + maquina + " perd l'usuari" + usuari);
            }
            
            if(usuari.equalsIgnoreCase("paper") && maquina==2)
            {
                punts_maquina++;
                punts_usuari--;
                System.out.println("guanya la maquina " + maquina + " perd l'usuari" + usuari);
            }
            if(usuari.equalsIgnoreCase("tisores") && maquina==1 )
            {
                punts_maquina++;
                punts_usuari--;
                System.out.println("guanya la maquina " + maquina + " perd l'usuari " + usuari);
            }

            if(usuari.equalsIgnoreCase("pedra") && maquina==2)
            {
                punts_usuari++;
                punts_maquina--;
                System.out.println("perd la maquina " + maquina + " guanya l'usuari " + usuari);
            }
            if(usuari.equalsIgnoreCase("paper") && maquina==1 )
            {
                punts_usuari++;
                punts_maquina--;
                System.out.println("perd la maquina " + maquina + " guanya l'usuari" + usuari);
            }
            if(usuari.equalsIgnoreCase("tisores") && maquina ==3 )
            {
                punts_usuari++;
                punts_maquina--;
                System.out.println("perd la maquina " + maquina + " guanya l'usuari" + usuari);
            }

            if(usuari.equalsIgnoreCase("paper") && maquina==3 )
            {
                System.out.println("empat ");
            }
            if(usuari.equalsIgnoreCase("tisores") && maquina==2 )
            {
                punts_maquina++;
                System.out.println("empat ");
            }
            if(usuari.equalsIgnoreCase("pedra") && maquina==1 )
            {
                System.out.println("empat ");

            }
            if (punts_maquina == 3 || punts_usuari==3)
            {
                parar = true;
            }
       
        } 
        if(punts_maquina ==3)
        {
        System.out.println(" a guanyat " + maquina + " maquina");   
        }
        if(punts_usuari ==3)
        {
        System.out.println(" a guanyat " + usuari + " usuari");   
        }

    }
}