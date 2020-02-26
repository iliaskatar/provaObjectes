/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Fes un programa que permeti afegir persones i les seves dades. Se li ha de demanar: Nom, cognom, dni i salari. 
//Per funcionar s'han d'utilitzar 4 arrays. Un per nom, cognom... Quan l'usuari hagi acabat d'introduir dades l'usuari 
//ha de prémer una "x" Posteriorment se li demanarà un nom i mostrarà totes les seves dades per pantalla. L'usuari ha de 
//poder buscar altres usuaris fins prèmer la tecla "x" que sortirà del programa.

/**
 *
 * @author Eric
 */
import java.util.Scanner;

public class Ex12loops {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean parar = false;

        String arrayNom[] = new String[100];
        String arrayCognom[] = new String[100];
        int arrayDni[] = new int[100];
        int arraySalari[] = new int[100];
        String NouUsuari;

        int contadorArrays = 0;
        while (!parar) {
            System.out.println("Introdueix el nom de la persona: ");
            arrayNom[contadorArrays] = scan.next();

            System.out.println("Introdueix el Cognom de la persona: ");
            arrayCognom[contadorArrays] = scan.next();

            System.out.println("Introdueix el Dni de la persona: ");
            arrayDni[contadorArrays] = scan.nextInt();

            System.out.println("Introdueix el Salari de la persona: ");
            arraySalari[contadorArrays] = scan.nextInt();

            contadorArrays++;

            System.out.println("Vols introduir un altre usuari? (si/no): ");

            NouUsuari = scan.next();

            if (NouUsuari.equalsIgnoreCase("no")) {
                parar = true;
            }
        }

        boolean stop = false;
        int contadorRandom = 0;
        while (!stop){
            System.out.println("Entra un nom a cercar");

            
            //String NomCercar = scan.nextLine();
            String NomCercar = System.console().readLine();

            if (NomCercar.equalsIgnoreCase("x")) {
                stop = true;
            }
            else 
            {
                int j = 0;
                for (j = 0; j < arrayNom.length; j++) {

                    if (NomCercar.equalsIgnoreCase(arrayNom[j])) {
                        System.out.println("El cognom de " + arrayNom[j] + " es " + arrayCognom[j] + " el se dni es "+ arrayDni[j] + " i el seu salari es " + arraySalari[j]);
                        break;
                    }else{
                        contadorRandom++;
                    }  
                }        
            }
        }
    }
}
