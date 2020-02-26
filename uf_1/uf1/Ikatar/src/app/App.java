package app;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        boolean sortir = false;
        int[][] arary = new int[10][10];
        String[][] cadena = new String[10][10];
        float[][] registra = new float[10][10];
        String[][] clients = new String[10][10];
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String[] datavui = sdf.format(date).split("/");

        System.out.println(" Benvinguts el FactuSoft sa ");
        System.out.println(" Data: " + datavui[0] + "/" + datavui[1] + "/" + datavui[2] + "\n");
        while (!sortir) {
            System.out.println(" tria una opcio ");
            System.out.println(
                    " 0- sortir \n 1- afegir material \n 2- visualitzar l’stock \n 3- l’entrada de clients  \n 4- realitzaar una venda");
            int opcio = Integer.parseInt(System.console().readLine());
            switch (opcio) {
            case 0:
                System.out.println(" Gràcies per fer servir l’aplicació FactuSoft. Fins un altra! ");

                sortir = true;
                System.out.println("  ");
                break;
            case 1:
                afegir_material(arary, cadena, registra);
                break;
            case 2:
                visualitzar_stock(arary, cadena, registra);
                break;
            case 3:
                registra_usuari(clients);
                break;
            case 4:
                realitzar_venda(clients, arary, cadena, registra);
                break;
            }

        }

    }

    public static void afegir_material(int[][] arary, String[][] cadena, float[][] registra) {

        float preu = 19.99f;
        boolean surt = false;
        int i = 0;
        int j = 0;
        int a = 0;
        while (!surt) {

            String num_referencia = System.console().readLine(" numero de referencia: ");
            String descripcio = System.console().readLine(" descripcio del producte: ");
            int unitats = Integer.parseInt(System.console().readLine(" cuantas unitats vols : "));
            for (j = 0; j < arary.length; j++) {
                arary[j][0] = unitats;
                if (arary[j][0] == unitats) {
                    // unitats= unitats+unitats;
                    surt = true;
                }
                 System.out.println(" unitats " + arary[j][0]);
            }
            for (i = 0; i < cadena.length; i++) {
                cadena[i][0] = num_referencia;
                cadena[i][1] = descripcio;
                if (cadena[i][0] == num_referencia) {
                    surt = true;
                }

                 System.out.println("numero de referencia " + cadena[i][0] + " descripcio " +
                 cadena[i][1]);
            }
            for (a = 0; a < registra.length; a++) {
                registra[a][0] = preu;
                if (unitats > 1) {
                    preu = preu * unitats;
                }
                 System.out.println("preu " + registra[a][0]);
            }
            int opcio = Integer.parseInt(System.console().readLine(" si vols sortir preta 0 : "));

            if (opcio == 0) {

                surt = true;
            }

        }
        // System.out.println(
        //         "------------------------------------------------------------------------------------------------------------");
        // System.out.println("numero de referencia " + cadena[i][0] + " descripcio " + cadena[i][1] + " unitats "
        //         + arary[j][0] + "preu " + registra[a][0]);
        // System.out.println(
        //         "------------------------------------------------------------------------------------------------------------");
    }

    public static void visualitzar_stock(int[][] arary, String[][] cadena, float[][] registra) {

        int i;
        int j;
        int a;
        for (i = 0; i < cadena.length; i++) {
            System.out.println("numero de referencia " + cadena[i][0] + " descripcio " +
             cadena[i][1]);
        }
        for (j = 0; j < arary.length; j++) {
            System.out.println(" unitats " + arary[j][0]);
        }
        for (a = 0; a < registra.length; a++) {
            System.out.println("preu " + registra[a][0]);
        }
        // System.out.println(
        //         "------------------------------------------------------------------------------------------------------------");
        // System.out.println("numero de referencia " + cadena[i][0] + " descripcio " + cadena[i][1] + " unitats "
        //         + arary[j][0] + "preu " + registra[a][0]);
        // System.out.println(
        //         "------------------------------------------------------------------------------------------------------------");
    }

    public static void registra_usuari(String[][] clients) {
        int l = 0;
        Random rnd = new Random();
        boolean sortir = false;
        while (!sortir) {

            String codi = System.console().readLine(" codi client: ");
            String nom = System.console().readLine(" nom del client: ");
            String cognom = System.console().readLine(" cognom del client: ");
            String poblacio = System.console().readLine(" poblacio del client: ");
            String telefon = System.console().readLine(" telefon del client: ");
            // if (telefon.equals(" 9")) {
            // System.out.println("escriu be el telefon ");

            // }
            for (int i = 0; i < clients.length; i++) {
                for (int j = 0; j < clients[0].length; j++) {
                    clients[i][0] = codi;
                    clients[i][1] = nom;
                    clients[i][2] = cognom;
                    clients[i][3] = poblacio;
                    clients[i][4] = telefon;
                    l = i;
                    sortir = true;

                }

            }
        }
        System.out.println(
                "------------------------------------------------------------------------------------------------------------");
        System.out.println(" codi client: " + clients[l][0] + " | nom client : " + clients[l][1] + " |cognom client: "
                + clients[l][2] + " | poblacio client: " + clients[l][3] + " | telefon client: " + clients[l][4]);
        System.out.println(
                "------------------------------------------------------------------------------------------------------------");

    }

    public static void realitzar_venda(String[][] clients, int[][] arary, String[][] cadena, float[][] registra) {
        boolean repetit = false;
        int i = 0;
        while (!repetit) {
            String nom = System.console().readLine(" nom del client: ");
            for (i = 0; i < clients.length; i++) {

            }
            if (nom.equalsIgnoreCase(clients[i][1])) {
                String telefon = System.console().readLine(" quin es el numero de telefon del client: ");
                if (telefon.equalsIgnoreCase(clients[i][4])) {
                    afegir_material(arary, cadena, registra);
                } else {
                    System.out.println(" Aquet usuari no  existeix per tant l’ha de registrar  primer");
                    repetit = true;
                    break;
                }

            }

        }

    }

    // public static void a(){

    // }
}