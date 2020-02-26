/**
 * practica_1_ex_3
 */
import java.util.Scanner;
public class practica_1_ex_3 {

    public static void main(String[] args) {

       
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
        System.out.println("Hola " + nom + " la teva edat es " + edat + " i el teu sexe es " + genere);
        
    }
}