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

            float v1;
            System.out.println("intrudueix el primer numero");
            v1 = Float.parseFloat(System.console().readLine());;
            

            float v2;
            System.out.println("intrudueix el segon numero");
            v2 = Float.parseFloat(System.console().readLine());


            System.out.println("el numero " + v1+ " + "  + v2 + " es igual = " + (v1+v2));
            System.out.println("el numero " + v1+ " - "  + v2 + " es igual = " + (v1-v2));
            System.out.println("el numero " + v1+ " / "  + v2 + " es igual = " + (v1/v2));
            System.out.println("el numero " + v1+ " * "  + v2 + " es igual = " + (v1*v2));

    }
    public static void suma(int numero, int numero2) {
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
    }
}