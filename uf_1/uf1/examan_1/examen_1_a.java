/**
 * examen_1_a
 */
import java.util.Random;
public class examen_1_a {
   

    public static void main(String[] args) {
       
        //////////////1
        /* System.out.println("intrudueix ledat");
        int edat = Integer.parseInt(System.console().readLine());
        if(edat>17)
        {
            System.out.println("-------Felicictats------ ");
        }
        else
        {
            System.out.println("ets menor de edat " + (18-edat) + " et falten");
        }
        if(edat<0||edat>130)
        {
            System.out.println("error");
        }*/

        /////////////2
        /*
        System.out.println("intrudueix el teu nom");
        String nom1 = System.console().readLine();
        System.out.println("intrudueix ledat");
        int edat1 = Integer.parseInt(System.console().readLine());


        System.out.println("intrudueix el segon  nom");
        String nom2 = System.console().readLine();
        System.out.println("intrudueix la seva edat");
        int edat2 = Integer.parseInt(System.console().readLine());

        int diferencia =0;
        diferencia = edat1-edat2;
        if(diferencia == 0)
        {
            System.out.println(" ------------son iguals---------- " );
        }
        else if (diferencia<0)
        {
            System.out.println(nom2 + " es mes gran. la diferencia es : " + (edat1-edat2));
        }
        else
        {
            System.out.println(nom1 + " es mes gran. la diferencia es : " + (edat1-edat2));
        }*/


        ///////////////////4

        /*
        Random ran = new Random();
        int[] array10 = new int [10];
        int[] array100 = new int [100];
        int[] array1000 = new int [1000];
        int count10 =0;

        for(int i =0;i<array10.length;i++)
        {
            array10[i]=ran.nextInt(2);
            if(array10[i]==0)
            {
                count10++;
            }
            System.out.println("cara " + count10);
            System.out.println("creu " + (count10-10));
            
        }
        count10=0;
        for(int i =0;i<array100.length;i++)
        {      
            array100[i]=ran.nextInt(2);
            if(array100[i]==0)
            {
                count10++;
            }
            System.out.println("cara " + count10);
            System.out.println("creu " + (count10-100));
        }
        count10=0;
        for(int i =0;i<array1000.length;i++)
        { 
            array1000[i]=ran.nextInt(2);
            if(array1000[i]==0)
            {
                count10++;
            }
            System.out.println("cara " + count10);
            System.out.println("creu " + (count10-1000));
        }*/

        boolean parar = false;
        System.out.println("joc pedra, paper o tisores \n");
        System.out.println("comensa usuari");

        int punts_maquina =0;

        int punts_usuari = 0;
        
        System.out.println("escriu lo que vols tirar ");
        String usuari;
        //Random rnd = new Random();
       
        System.out.println("li toca tirar maquina");
        //int [] maquina = new Random(1, 3, 2);

        int  maquina = 1;
        //maquina = rnd.Random();
        while(!parar)
        {
            System.out.println("escriu lo que vols tirar ");
            usuari = System.console().readLine();
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