package app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import org.omg.PortableServer.IdAssignmentPolicy;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);

        ArrayList<String> cantant = new ArrayList<String>();
        ArrayList<String> titol = new ArrayList<String>();
        ArrayList<ArrayList<String>> llista = new ArrayList<ArrayList<String>>();

        c
        ArrayList<Integer> vot = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> vots = new ArrayList<ArrayList<Integer>>();

        boolean sortir = false;
        int dni = 0;
        int opccio;

        while (!sortir) {
            System.out.println("         MENU        ");
            System.out.println(" 0- sortir \n 1- afagir tema \n 2- mostrar tema \n 3- votar tema \n 4- eliminar tema");
            opccio = sn.nextInt();
            sn.nextLine();
            switch (opccio) {

            case 0:
                sortir = true;
                break;
            case 1:
                System.out.println("afageix un cantant : ");
                cantant.add(sn.nextLine());
                System.out.println("afageix un titol : ");
                titol.add(sn.nextLine());
                llista.add(cantant);
                llista.add(titol);
                id.add(llista.get(0).size());
                vot.add(0);
                vots.add(id);
                vots.add(vot);
                // System.out.println("id: " + id.get(0) + " titol: " + titol.get(0) + "
                // cantant: " + cantant.get(0) + " vots: " + vot.get(0));
                break;
            case 2:
                showtable(llista, vots);

                break;
            case 3:
                votacionts(vots, id);

                break;
            case 4:
                eliminar(llista, vots);

                break;
            }
        }

    }

    public static void showtable(ArrayList<ArrayList<String>> llista, ArrayList<ArrayList<Integer>> vots) {
        for (int i = 0; i < llista.get(0).size(); i++) {
            System.out.println("-id: " + vots.get(0).get(i) + " -titol: " + llista.get(0).get(i) + " -cantant: "
                    + llista.get(1).get(i) + " -vots: " + vots.get(1).get(i));

        }

    }

    public static void votacionts(ArrayList<ArrayList<Integer>> vots, ArrayList<Integer> id) {
        Scanner sn = new Scanner(System.in);

        for (int i = 0; i < vots.get(0).size(); i++) {
            System.out.println("votacions " + " -titol: " + vots.get(0).get(i));
            vots.get(1).set(i, sn.nextInt());
        }
        // int maxim = 0;
        // for (int i = 0; i > vots.get(0).size(); i++) {
        // // vots.set(id, vots.get(id)+1);
        // if (maxim < vots.get(1).size()) {
        // i = maxim;
        // }
        // }
    }

    // public static int fac(int id, ArrayList<Integer> variable) {
    // Scanner sn = new Scanner(System.in);
    // int pocicio= variable.get(1);
    // vots.set(id, vots.get(id)+1);
    // //variable.get(1).set(pocicio(variable.get(1)+pocicio));
    // return 1;
    // }

    public static void eliminar(ArrayList<ArrayList<String>> llista, ArrayList<ArrayList<Integer>> vots) {
        Scanner sn = new Scanner(System.in);

        boolean sortir = false;
        String a = " ";
        while (!sortir) {
            for (int i = 0; i < llista.get(0).size(); i++) {
                System.out.println("-id: " + vots.get(0).get(i) + " -titol: " + llista.get(0).get(i) + " -cantant: "
                        + llista.get(1).get(i) + " -vots: " + vots.get(1).get(i));
    
            }
            for (int i = 0; i < vots.get(0).size(); i++) {
                System.out.println("posa id que volguis elimina : ");
                vots.get(i).remove(sn.nextInt());

                llista.get(i).remove(i);
                System.out.println("vols elimina un altre tema : ");
                a = System.console().readLine();
                if (a.equals("no")) {
                    sortir = true;
                    break;
                }
            }

        }

    }

}