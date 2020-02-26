package app;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class App {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Map<Integer, ArrayList<Object>> basquet = new HashMap<>();
        Map<String, ArrayList<String>> equips = new HashMap<>();
        Map<Integer, Integer> puntuacio = new HashMap<>();


        boolean sortir = false;
        int opcio = 0;

        while (!sortir) {
            menu();
            opcio = sc.nextInt();
            sc.nextLine();
            switch (opcio) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    ArrayList<Object> values = new ArrayList<>();
                    System.out.print("Dorsal del jugador? ");
                    int key = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nom del jugador: ");
                    values.add(sc.nextLine());
                    for (int x = 0; x < 4; x++) {// punts
                        values.add(0); 
                    }
                    basquet.put(key, values);
                }

                break;
            case 2:
                equip(basquet);
                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;

            default:
                break;
            }
        }

    }

    public static void menu() {
        System.out.println("#################################");
        System.out.println("#             menu              #");
        System.out.println("#################################");
        System.out.println("#   1-jugadors                  #");
        System.out.println("#   2-equip                     #");
        System.out.println("#   3-punts                     #");
        System.out.println("#   4-partit                    #");
        System.out.println("#   5-sortir                    #");
        System.out.println("#################################");
    }

    public static void jugadors(Map<Integer, ArrayList<Object>> basquet) {

    }

    public static void equip(Map<Integer, ArrayList<Object>> basquet) {
        basquet.forEach((k, v) -> {
            System.out.println("dorsal: " + k + " nom " + v.get(0));
        });
    }

    public static void punts(Map<Integer, Integer> puntuacio) {
        ArrayList<Object> values = new ArrayList<>();

    }

    public static void partot() {

    }

    public static void marcador() {

    }
}