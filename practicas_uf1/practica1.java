package practicas_uf1;

/**
 * practica1
 */
import java.util.Scanner;
public class practica1 {

    public static void main(String[] args) {

        //practica 1 ex.1 
        /*
            System.out.print("Introdueix el teu nom::");
           String nom = System.console().readLine();
            System.out.println(nom);

            System.out.print("Introdueix el teu cognom:");
            String cognom = System.console().readLine();
            System.out.println(cognom);
            System.out.print("Introdueix ara el domini:");
            String email = System.console().readLine();
            System.out.println(email);
            System.out.println("el teu correu es : " + nom + "." + cognom +"@"+email);
        */
            //practica 1 ex.2

/*
            float pes;
            float alçada;
            float IMAC;
            System.out.print("Introdueix el teu pes:");
            pes = Float.parseFloat(System.console().readLine());
            System.out.println(pes);

            System.out.print("Introdueix el teu alçada:");
            alçada = Float.parseFloat(System.console().readLine());
            System.out.println(alçada);

            
           IMAC = pes/(alçada*2);

            
            if (IMAC<18.5)
            {
               System.out.println("ets molt prim " + IMAC);
            }
           if (IMAC > 18.5 && IMAC < 24.9)
            {
                System.out.println("estas perfecte " + IMAC);
            }
            if (IMAC > 25.0 && IMAC < 29.9)
            {
                System.out.println(" ets casi un porc" + IMAC);
            }
            if (IMAC >= 30.0)
            {
                System.out.println(" ets molt gordu " + IMAC);
            }*/


            //practica 1 ex.3
/*
            Scanner scan = new Scanner(System.in);
            float edat;
            System.out.print("Introdueix el teu nom : ");
            String nom = System.console().readLine();

            System.out.print("Introdueix la teva edat : ");
            edat = Float.parseFloat(System.console().readLine());

            System.out.print("Introdueix el teu genere : F/M ");
            
            char genere; 

            genere = scan.next().charAt(0);
             

            if(edat < 16)
            {
                System.out.println(" es menor");
                
                if(genere == 'M')
                    {
                        System.out.println(" es mesculi");

                    }
                if(genere == 'F')
                    {
                        System.out.println(" es femeni");

                    }

            }
            if(edat >= 16 && edat <= 65)
            {
                System.out.println(" es major");
                
                if(genere == 'M')
                    {
                        System.out.println(" es mesculi");

                    }
                if(genere == 'F')
                    {
                        System.out.println(" es femeni");

                    }

            }
            if(edat > 65)
            {
                System.out.println(" es vetera");
                
                if(genere == 'M')
                    {
                        System.out.println(" es mesculi");

                    }
                if(genere == 'F')
                    {
                        System.out.println(" es femeni");

                    }

            }
            System.out.println("Hola " + nom + " la teva edat es " + edat + " iel teu sexe es " + genere);

*/
             // practica 1 ex.4
            /*
             System.out.print("Introdueix el nom de l´article: ");
             String nom = System.console().readLine();
 
             float preu;
             System.out.print("Introdueix el preu : ");
             preu = Float.parseFloat(System.console().readLine());
 
             float descompte;
             System.out.print("Introdueix el descompte : ");
 
             descompte = Float.parseFloat(System.console().readLine());
             float preu_final;
 
            
              //preu_final = preu_final -(descompte*preu)/100;
              preu_final = preu * (1- (descompte/100));
 
              System.out.println(" el producte " + nom + " El preu final de l'article és de : " + preu_final);
        */
        
    }
}