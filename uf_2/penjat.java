/**
 * penjat
 */

import java.util.Random;
import java.util.Scanner;
public class penjat {
    static final int numParaules = 3;
    static final int numLletresAbecedari = 26;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String arrayParaules[] = new String[numParaules];
        mostraBenvinguda();
        System.out.println("Introdueix la mida de les paraules: ");
        int mida = sc.nextInt();
        sc.nextLine();
        char arrayPanell[] = new char[mida];
        inicialitzaArrayPanell(arrayPanell); // L'inicialitza amb '_'
        char arrayLletresDites[] = new char[numLletresAbecedari];
        for (int i = 0; i < arrayParaules.length; i++) {
            boolean ok = false;
            while (!ok) {
                ok = true;
                System.out.println("Escriu una paraula número " + (i + 1));
                String paraula = sc.next();
                if (comprovaMidaParaula(paraula, mida)) {
                    arrayParaules[i] = paraula;

                } else {
                    System.out.println("Mida incorrecta. Has d'escriure paraules de " + mida + " caracters.");
                    ok = false;
                }
            }
        }

        String paraulaSecreta = triaParaulaSecretaRandom(arrayParaules);
        char arrayParaulaSecreta[] = deStringACharArray(paraulaSecreta); // Passa un String a array de chars

        int posicio = 0;
        int errors = 0;
        boolean estasPenjat = false;
        boolean hasTriunfat = false;
        while (!estasPenjat && !hasTriunfat) {
            mostraPanell(arrayPanell);
            char lletra;
            String valorEntrat;
            do {
                System.out.println("Introdueix una lletra");
                valorEntrat = sc.next();
                lletra = valorEntrat.charAt(0);

            } while (!(comprovaSiEsLletra(lletra) && comprovaSiNomesEsUnaSolaLletra(valorEntrat)
                    && comprovaSiJaHaDitLaLletra(lletra, arrayLletresDites)));

            afegeixLletraAArrayDeLletresDites(lletra, arrayLletresDites, posicio);
            posicio++;
            errors = actualitzaPanellAmbLletra(lletra, arrayParaulaSecreta, errors, arrayPanell);
            printaPenjat(errors);

            if (comprovaSiHasPalmat(errors)) {
                estasPenjat = true;
                sc.close();
            }

            if (comprovaSiHasGuanyat(arrayPanell)) {
                hasTriunfat = true;
                sc.close();
            }

        }

        if (hasTriunfat) {
            System.out.println("Felicitats! Has descobert la paraula amb " + errors + " errors.");
        } else {
            System.out.println("Collons.. No era tan difícil.. La paraula era: " + paraulaSecreta);
            System.out.println("Has palmat!");
        }
    
        
    }
    public static void mostraBenvinguda (){
        System.out.println("                   HOLA BENVINGUTS EL CLUP DEL PENJAT                  ");

    }
    public static void A ( char arrayPanell[]){
        

    }
}