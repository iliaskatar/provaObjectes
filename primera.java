/**
 * primera
 */
 import java.util.Scanner;
public class primera {

    public static void main(String[] args) {
       
    //primer exercici
   /*
      final int DIES_SETMANA = 7;

        float PrimerValor = 4;
        float SegonVAlor = 6;
        float Resultat;

         Resultat = PrimerValor / SegonVAlor;

        System.out.println("el velor final es : " + Resultat);
        */

        // segon exercici
/*
        int edat = 18;
        boolean major = false;
        String salutacions = " hauras de esperar";
            if (edat >= 18)
            {
                major = true;
                salutacions = " ja pots conduir";
            }
            System.out.println("es major de edat? " + major);
            System.out.println(salutacions);
*/
            // tercer exercici
/*
            char lletra = 'h';
            char lletra1 = 'o';
            char lletra2= 'l';
            char lletra3 = 'a';

            //String x = "" +lletra+lletra1+lletra+lletra2+lletra3; falta treura per pantalla
            System.out.println(" "+lletra+lletra1+lletra2+lletra3);
*/

/*
            // cuart exercici
            Scanner numero = new Scanner(System.in);
            int numero1 = 0;
            int numero2 = 0;
          

            int opccio =0;
            boolean para = false;
            
           
            while(para == false)
            {
                System.out.println(" tria una opcio "); 
                System.out.println(" 1- suma \n 2- divicio \n 3-resa \n 4-multiplicacio \n 5- sortir");

                opccio = numero.nextInt();

                if(opccio == 1)
                    {
                        System.out.println(" Escriu el primer numero");
                        numero1 = numero.nextInt();
                        System.out.println(" escriu el segon numero");
                        numero2 = numero.nextInt();
                        System.out.println("la suma es : ");
                        suma(numero1, numero2);
                    }
                    if(opccio == 2)
                    {
                            System.out.println(" Escriu el primer numero");
                            numero1 = numero.nextInt();
                            System.out.println(" escriu el segon numero");
                            numero2 = numero.nextInt();
                            System.out.println("la divicio es : ");
                            divicio(numero1, numero2);
                    }
                    if(opccio == 3)
                    {
                            System.out.println(" Escriu el primer numero");
                            numero1 = numero.nextInt();
                            System.out.println(" escriu el segon numero");
                            numero2 = numero.nextInt();
                            System.out.println("la resta es : ");
                            resta(numero1, numero2);
                    }
                    if(opccio == 4)
                    {
                            System.out.println(" Escriu el primer numero");
                            numero1 = numero.nextInt();
                            System.out.println(" escriu el segon numero");
                            numero2 = numero.nextInt();
                            System.out.println("la multiplicacio es : ");
                            multiplicacio(numero1, numero2);
                    }
                    if (opccio == 5)
                    {
                        para = true;                        
                    }
                    System.out.println(numero);

            }*/


            //exemples
/*
            float v1;
            System.out.println("intrudueix el primer numero");
            v1 = Float.parseFloat(System.console().readLine());;
            

            float v2;
            System.out.println("intrudueix el segon numero");
            v2 = Float.parseFloat(System.console().readLine());


            System.out.println("el numero " + v1+ " + "  + v2 + " es igual = " + (v1+v2));
            System.out.println("el numero " + v1+ " - "  + v2 + " es igual = " + (v1-v2));
            System.out.println("el numero " + v1+ " / "  + v2 + " es igual = " + (v1/v2));
            System.out.println("el numero " + v1+ " * "  + v2 + " es igual = " + (v1*v2));*/

  //practica 1 ex.1 
        /*
            System.out.print("Introdueix el teu nom: ");
            String nom = System.console().readLine();
            System.out.print("Introdueix el teu cognom:");
            String cognom = System.console().readLine(); 
            System.out.print("Introdueix ara el domini:");
            String email = System.console().readLine();
            System.out.println("el teu correu es : " + nom + "." + cognom +"@"+email);
            */


             //practica 2 ex.2
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
             }
*/
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
            System.out.println("Hola " + nom + " la teva edat es " + edat + " i el teu sexe es " + genere);
            */

            // practica 1 ex.4
            
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

    }
    /*public static void suma(int numero, int numero2) {
        int resultat;
        
        resultat = numero + numero2;
        System.out.println(resultat);
        
    }
    public static void divicio(int numero, int numero2) {
        double resultat1;
        
        resultat1 = numero / numero2;
        System.out.println(resultat1);
    }
    public static void resta(int numero, int numero2) {
        int resultat2;
        
        resultat2 = numero - numero2;
        System.out.println(resultat2);
    }  
    public static void multiplicacio(int numero, int numero2) {
        int resultat3;
        
        resultat3 = numero * numero2;
        System.out.println(resultat3);
    
    }*/
}