/**
 * pracrica_2_ex_4
 */
import java.util.Scanner;

public class pracrica_2_ex_4 {

    public static void main(String[] args) {
        // 4 - Demana a l'usuari un número de dni i el programa calcula la lletra corresponent 
        //(http://www.interior.gob.es/web/servicios-al-ciudadano/dni/calculo-del-digito-de-control-del-nif-nie )

        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("escriu els numeros del dni");
        int dni = scan.nextInt();
        
        if(dni % 23 ==0)
        {
            System.out.println(" el dni " + dni + " T");
        }
        if(dni % 23 ==1)
        {
            System.out.println(" el dni " + dni + " R");
        }
        if(dni % 23 ==2)
        {
            System.out.println(" el dni " + dni + " W");
        }
        if(dni % 23 ==3)
        {
            System.out.println(" el dni " + dni + " A");
        }
        if(dni % 23 ==4)
        {
            System.out.println(" el dni " + dni + " G");
        }if(dni % 23 ==5)
        {
            System.out.println(" el dni " + dni + " M");
        }
        if(dni % 23 ==6)
        {
            System.out.println(" el dni " + dni + " Y");
        }
        if(dni % 23 ==7)
        {
            System.out.println(" el dni " + dni + " F");
        }
        if(dni % 23 ==8)
        {
            System.out.println(" el dni " + dni + " P");
        }
        if(dni % 23 ==9)
        {
            System.out.println(" el dni " + dni + " D");
        }
        if(dni % 23 ==10)
        {
            System.out.println(" el dni " + dni + " X");
        }
        if(dni % 23 ==11)
        {
            System.out.println(" el dni " + dni + " B");
        }
        if(dni % 23 ==12)
        {
            System.out.println(" el dni " + dni + " N");
        }
        if(dni % 23 ==13)
        {
            System.out.println(" el dni " + dni + " J");
        }
        if(dni % 23 ==14)
        {
            System.out.println(" el dni " + dni + " Z");
        }
        if(dni % 23 ==15)
        {
            System.out.println(" el dni " + dni + " S");
        }
        if(dni % 23 ==16)
        {
            System.out.println(" el dni " + dni + " Q");
        }
        if(dni % 23 ==17)
        {
            System.out.println(" el dni " + dni + " V");
        }
        if(dni % 23 ==18)
        {
            System.out.println(" el dni " + dni + " H");
        }
        if(dni % 23 ==19)
        {
            System.out.println(" el dni " + dni + " L");
        }
        if(dni % 23 ==20)
        {
            System.out.println(" el dni " + dni + " C");
        }
        if(dni % 23 ==21)
        {
            System.out.println(" el dni " + dni + " K");
        }
        if(dni % 23 ==22)
        {
            System.out.println(" el dni " + dni + "E");
        }
        
        
    }
}