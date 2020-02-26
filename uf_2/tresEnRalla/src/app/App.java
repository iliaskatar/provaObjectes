package app;

import java.io.Console;
import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        Random rn = new Random();
        System.out.println("             TRES EN RALLA                 ");
        String nom = System.console().readLine(" nom del jugador:  ");
        String nomMaquina = " Maquina ";
        String[][] taulell = new String[3][3];
        char fitxaJugador = ' ';
        char fitxaMaquina = ' ';
        String cordanades;

        System.out.println("tria una peça x/o ");
        fitxaJugador = sn.next().charAt(0);
        if (fitxaJugador == 'x') {
            fitxaMaquina = 'o';
        }
        if (fitxaJugador == 'o') {
            fitxaMaquina = 'x';
        }
        System.out.println(" vols començar tiran? s/n ");

        char[] partida = { ' ', ' ' };
        char resposta = sn.next().charAt(0);
        if (resposta == 's') {
            System.out.println(" comença jugador");
        } else {
            System.out.println(" comença maquina");
        }

        for (int i = 0; i < partida.length; i++) {

            partida[1]=resposta;
            System.out.print(" 1/" + partida[i]);
        }
        if (resposta == 's') {
            // fitxaJugador = tirarFitxa(fitxaJugador, fitxaMaquina, taulell);
            // fitxaMaquina = tirarFitxa(fitxaJugador, fitxaMaquina, taulell);
        } else {

            // fitxaMaquina = tirarFitxa(fitxaJugador, fitxaMaquina, taulell);
            // fitxaJugador = tirarFitxa(fitxaJugador, fitxaMaquina, taulell);

        }

        String tirarjugador = " ";
        String tirarMaquina = " ";

        tirarFitxa(tirarjugador, tirarMaquina, taulell);
        
        System.out.println(nom + " te la fitxa ---> " + fitxaJugador);
        System.out.println(nomMaquina + " te la fitxa ---> " + fitxaMaquina);
        String a = "2-1";
        String[] array = a.split("-");
        int x = Integer.parseInt(array[0]);
        int y = Integer.parseInt(array[1]);
        printar(taulell);
        // System.out.println(tirarjugador + " maquina " + tirarMaquina);

    }

    public static boolean triar(char resposta) {

        return false;

    }

    public static void tirarFitxa(String fitxaJugador, String fitxaMaquina, String[][] taula) {
        Scanner sn = new Scanner(System.in);
        Random rn = new Random();
        int i = 0;
        int j = 0;
        String[][] cordenades = new String[3][3];// { { "0-0", "0-1", "0-2" }, { "1-0", "1-1", "1-2" }, { "2-0", "2-1",
                                                 // "2-2" } }
        boolean sortir = false;
        while (!sortir) {
            System.out.println("escriu una cordanada una cordenada(ex: 0-0) ");
            // cordenades=sn.nextLine();
            fitxaJugador = sn.nextLine();
            fitxaMaquina = rn.toString();
            if (cordenades[i][j] == taula[i][j]) {

                taula[i][j] = fitxaJugador;
                taula[i][j] = fitxaMaquina;
                sortir = true;
            }

        }
    }

    public static void printar(String[][] taulell) {

        for (int i = 0; i < taulell.length; i++) {
            for (int j = 0; j < taulell[0].length; j++) {
                taulell[i][j] = "-";
                // System.out.print(" \t " + taulell[i][j] );
            }
            // System.out.println();
        }

        System.out.println("    |-----------|");
        System.out.println("    | " + taulell[0][0] + " | " + taulell[0][1] + " | " + taulell[0][2] + " | ");
        System.out.println("    |-----------|");
        System.out.println("    | " + taulell[1][0] + " | " + taulell[1][1] + " | " + taulell[1][2] + " | ");
        System.out.println("    |-----------|");
        System.out.println("    | " + taulell[2][0] + " | " + taulell[2][1] + " | " + taulell[2][2] + " | ");
        System.out.println("    |-----------|");

    }
}
