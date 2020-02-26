package app;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Map<Integer, ArrayList<Object>> stock = new HashMap<>();
        Map<String, ArrayList<String>> clients = new HashMap<>();
        Map<Integer, Integer> comanda = new HashMap<>();

        int opcio = 0;
        boolean sortir = false;
        while (!sortir) {
            menu();
            opcio = sc.nextInt();
            sc.nextLine();

            switch (opcio) {
            case 1:
                afagir(stock);
                break;
            case 2:
                mostrar(stock);
                break;
            case 3:
                crearClient(clients);
                break;
            case 4:
                cerca(clients);
                break;
            case 5:
                venda(clients, stock, comanda);
                break;
            case 6:
                sortir = true;
                break;
            }
        }
    }

    public static void menu() {
        System.out.println("#################################");
        System.out.println("#             menu              #");
        System.out.println("#################################");
        System.out.println("#   1-afagir stock              #");
        System.out.println("#   2-mostrar stock             #");
        System.out.println("#   3-crear client              #");
        System.out.println("#   4-cercar clientper telefon  #");
        System.out.println("#   5-venda                     #");
        System.out.println("#   6-sortir                    #");
        System.out.println("#################################");
    }

    public static void afagir(Map<Integer, ArrayList<Object>> x) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Object> values = new ArrayList<>();
        boolean sortir = false;
        int y = 0;
        String a = " ";
        float w = 0;
        while (!sortir) {
            System.out.print("introdueix la rafarencia (0 per sortir): ");
            x.put(y, values);
            y = sc.nextInt();
            sc.nextLine();
            if (y == 0) {
                sortir = true;
                break;
            }
            if (x.containsKey(y)) {
                System.out.print("introdueix la quantitat: ");
                y = sc.nextInt();
            }
            System.out.print("introdueix la descripcio: ");
            a = sc.nextLine();
            System.out.print("introdueix el preu del producte (si cal sapare-ho amb una coma): ");
            w = sc.nextFloat();
            System.out.print("introdueix la quantitat: ");
            y = sc.nextInt();

        }
    }

    public static void mostrar(Map<Integer, ArrayList<Object>> x) {
        ArrayList<Object> values = new ArrayList<>();

        for (Object o : values) {
            System.out.println("Referencia: " + values.get(1) + " Descripcio: " + values.get(2) + "quantitat: "
                    + values.get(3) + " Preu/Unitat " + values.get(4));
        }

    }

    public static void crearClient(Map<String, ArrayList<String>> x) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> values = new ArrayList<>();
        String a = " ";
        System.out.print("introdueix el nom: ");
        x.put(a, values);
        a = sc.nextLine();
        System.out.print("introdueix el cognom: ");
        x.put(a, values);
        a = sc.nextLine();
        System.out.print("introdueix el adreça: ");
        x.put(a, values);
        a = sc.nextLine();
        System.out.print("introdueix el poblacio: ");
        x.put(a, values);
        a = sc.nextLine();
        System.out.print("introdueix el telefon: ");
        x.put(a, values);
        a = sc.nextLine();

    }

    public static void cerca(Map<String, ArrayList<String>> x) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> values = new ArrayList<>();
        boolean sortir = false;
        int y = 0;
        String a = " ";
        float w = 0;
        while (!sortir) {
            System.out.print("introdueix el numero de telefon del client (0 per sortir): ");
            x.put(a, values);
            a = sc.nextLine();
            if (a.equals("0")) {
                sortir = true;
                break;
            }
            for (String o : values) {
                System.out.println("nom: " + values.get(1) + " cognom: " + values.get(2) + "adreça: "
                        + values.get(3) + " poblacio " + values.get(4) + " telefon " + values.get(5));
            }

        }

    }

    public static void venda(Map<String, ArrayList<String>> x, Map<Integer, ArrayList<Object>> y,
            Map<Integer, Integer> comanda) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> values = new ArrayList<>();
        ArrayList<Object> keys = new ArrayList<>();
        ArrayList<Integer> factura = new ArrayList<>();
        boolean sortir = false;
        int o = 0;
        String a = " ";
        float w = 0;
        while (!sortir) {
            System.out.println("introdueix el numero de telefon del client: ");
            a = sc.nextLine();

            if (a.equals("0")) {
                sortir = true;
                break;
            }
            boolean sa = false;
            while (!sa) {
                System.out.println("intrudoeix la rafarencia del producte (0 per sortir)");
                o = sc.nextInt();
                if (o == 0) {
                    sa = true;
                    sortir = true;
                    break;
                }

                if (sortir) {
                    System.out.println("la rafarencia no consta en stock");
                }
                sa = true;

            }
            boolean va = false;
            while (!va) {
                System.out.println("introdueix la quantitat:");
                o = sc.nextInt();
                if (o == 0) {
                    va = true;
                    sortir = true;
                    break;
                }
                // if (sortir) {
                // System.out.println("Errrooor de " + keys.get(1) + " nomes hi han " +
                // keys.get(4));
                // }
                // System.out.println("ara quedan " + keys.get(4) + " unitats ");
                va = true;
            }
        }
        System.out.println("************************************");
        System.out.println("*************factura****************");
        System.out.println("************************************");
        for (String l : values) {
            System.out.println("nom: " + values.get(1) + " cognom: " + values.get(2) + "adreça: "
                    + values.get(3) + " poblacio " + values.get(4) + " telefon " + values.get(5));
        }
        for (Object p : keys) {
            System.out.println("Referencia: " + keys.get(1) + " Descripcio: " + keys.get(2) + "quantitat: "
                    + keys.get(3) + " Preu/Unitat " + keys.get(4));
        }
        // for (String l : values) {
        //     System.out.println("subtotal: " + values.get(1) + " IVA(21%): " + values.get(2) + "total: "
        //             + values.get(3));
        // }

    }
}