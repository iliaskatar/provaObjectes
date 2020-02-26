/**Bingo*/
import java.util.Scanner;
import java.util.Random;
public class Bingom {

    public static void main(String[] args) {
        boolean tornar = true; 
        Scanner sc = new Scanner(System.in);

        while (tornar) {
            /**Variables*/
            int p = 0, pos = 0;
            String rep;
            boolean bingo = false, linia = false; 
            Random r = new Random();
           

            /**Variables P1*/
            int[][] cartell = new int[3][9];
            String[][] cart = new String[3][9];
            int[] blanc = new int[9], bs = new int[89] ;
            int cl = 0, cb = 0;

            /**Variables P2*/
            int[][] cartell2 = new int[3][9];
            String[][] cart2 = new String[3][9];
            int[] blanc2 = new int[9];
            int cl2 = 0, cb2 = 0;
     
            /**!0 Arrays Blanc*/
            for (int i = 0; i < blanc.length; i++) {
                blanc[i] = 4;
                blanc2[i] = 4;
            }

            /**Decidir posicions dels 0*/
            for (int i = 0; i < blanc.length; i++) {
                boolean guardar = false;
                while (!guardar){
                    p = 0;
                    int num = r.nextInt(3);
                    for (int j = 0; j < blanc.length; j++) {
                        if (blanc[j] == num) {
                            p++;
                        }
                    }
                    if (p < 3) {
                        blanc[i] = num;
                        guardar = true;
                    }
                }
            }

            /**Decidir posicions 0 P2*/
            for (int i = 0; i < blanc2.length; i++) {
                boolean guardar = false;
                while (!guardar){
                    p = 0;
                    int num = r.nextInt(3);
                    for (int j = 0; j < blanc2.length; j++) {
                        if (blanc2[j] == num) {
                            p++;
                        }
                    }
                    if (p < 3) {
                        blanc2[i] = num;
                        guardar = true;
                    }
                }
            }

            /**Numeros i cartell P1*/
            for (int i = 0; i < cartell[0].length; i++) {
                for (int j = 0; j < cartell.length; j++) {
                    boolean sortir = false;
                    while (!sortir) {
                        int num = r.nextInt(10) + ( 10 * i);
                        boolean guardar = true;
                        for (int t = 0; t < cartell.length; t++) {
                            if (num == cartell[t][i]) {
                                guardar = false;
                                break;
                            }
                        }
                        if (guardar) {
                            cartell[j][i] = num;
                            sortir = true;
                        }
                    }
                }
            }

            /**Numeros i cartell P2*/
            for (int i = 0; i < cartell2[0].length; i++) {
                for (int j = 0; j < cartell2.length; j++) {
                    boolean sortir = false;
                    while (!sortir) {
                        int num = r.nextInt(10) + ( 10 * i);
                        boolean guardar = true;
                        for (int t = 0; t < cartell2.length; t++) {
                            if (num == cartell2[t][i]) {
                                guardar = false;
                                break;
                            }
                        }
                        if (guardar) {
                            cartell2[j][i] = num;
                            sortir = true;
                        }
                    }
                }
            }

            /**Ordenar nomeors*/
            for (int i = 0; i < cartell[0].length; i++) {
                for (int k = 0; k < cartell[0].length; k++) {
                    for (int j = 0; j < cartell.length - 1; j++) {
                        if (cartell[j][i] > cartell[j + 1][i]) {
                            int m = cartell[j + 1][i];
                            cartell[j + 1][i] = cartell[j][i];
                            cartell[j][i] = m;
                        }
                    }
                    for (int j = 0; j < cartell2.length - 1; j++) {
                        if (cartell2[j][i] > cartell2[j + 1][i]) {
                            int m = cartell2[j + 1][i];
                            cartell2[j + 1][i] = cartell2[j][i];
                            cartell2[j][i] = m;
                        }
                    }
                }
            }

            /**Posar 0 a la matriu*/
            for (int i = 0; i < cartell[0].length; i++) {
                for (int j = 0; j < cartell.length; j++) {
                    if (j == blanc[i]){
                        cartell[j][i] = 0;
                    }
                }
                for (int j = 0; j < cartell2.length; j++) {
                    if (j == blanc2[i]){
                        cartell2[j][i] = 0;
                    }
                }
            }

            /**Cartell avans de bola*/
            for (int j = 0; j < 10; j++) {
                System.out.println("");
            }
            System.out.println("\tCartell jugador 1\t\t\t\t\t\t\tCartell jugador 2" );
            System.out.print('\n');
            for (int j = 0; j < cartell.length; j++) {
                for (int k = 0; k < cartell[0].length; k++) {
                    if (cartell[j][k] == 0) {
                        cart[j][k] = "x";
                    } else {
                        cart[j][k] = String.valueOf(cartell[j][k]);
                    }
                }
                for (int k = 0; k < cartell[0].length; k++) {
                    System.out.print("\t" + cart[j][k]);
                }
                System.out.print("\t | \t");
                for (int k = 0; k < cartell2[0].length; k++) {
                    if (cartell2[j][k] == 0) {
                        cart2[j][k] = "x";
                    } else {
                        cart2[j][k] = String.valueOf(cartell2[j][k]);
                    }
                }
                for (int k = 0; k < cartell2[0].length; k++) {
                    System.out.print("\t" + cart2[j][k]);
                }
                System.out.print('\n');
                System.out.print('\n');
            }
            System.out.println("Enter per començar");
            sc.nextLine();

            /**Joc*/
            while (!bingo) {
                boolean guardar = false;
                int bb = 0;
            
                /**Treure la bola*/
                while (!guardar) {
                    guardar = true;
                    bb = r.nextInt(89) + 1;
                    for (int j = 0; j < bs.length; j++) {
                        if (bs[j] == bb) {
                            guardar = false;
                            break;
                        }
                    }
                    if (guardar) {
                        bs[pos] = bb;
                        pos++;
                        for (int j = 0; j < cartell.length; j++) {
                            for (int k = 0; k < cartell[0].length; k++) {
                                if (cartell[j][k] == bb) {
                                    cartell[j][k] = 0;
                                    cart[j][k] = "$";
                                }
                            }
                            for (int k = 0; k < cartell2[0].length; k++) {
                                if (cartell2[j][k] == bb) {
                                    cartell2[j][k] = 0;
                                    cart2[j][k] = "$";
                                }
                            }
                        }
                    }
                }

                /**Escriure Cartell*/
                for (int j = 0; j < 10; j++) {
                    System.out.println("");
                }
                System.out.println("\tCartell jugador 1\t\t\t\t\t\t\tCartell jugador 2" );
                System.out.print('\n');
                for (int j = 0; j < cartell.length; j++) {
                    for (int k = 0; k < cartell[0].length; k++) { 
                        System.out.print("\t" + cart[j][k]);
                    }
                    System.out.print("\t | \t");
                    for (int k = 0; k < cartell2[0].length; k++) {
                        System.out.print("\t" + cart2[j][k]);
                    }
                    System.out.print('\n');
                    System.out.print('\n');
                }
                guardar = false;

                /**Linia*/
                if (!linia) {
                    cl++;
                    cl2++;
                    for (int j = 0; j < cartell.length; j++) {
                        int math = 0;
                        for (int k = 0; k < cartell[0].length; k++) {
                            math = math + cartell[j][k];
                        }
                        if (math == 0) {
                            System.out.println("P1: linia!!!");
                            linia = true;
                            break;
                        }
                        math = 0;
                        for (int k = 0; k < cartell2[0].length; k++) {
                            math = math + cartell2[j][k];
                        }
                        if (math == 0) {
                            System.out.println("P2: linia!!!");
                            linia = true;
                            break;
                        }
                    }
                    
                }

                /**Bingo*/
                if (!bingo){
                    int math = 0;
                    cb++;
                    cb2++;
                    for (int j = 0; j < cartell.length; j++) {
                        for (int k = 0; k < cartell[0].length; k++) {
                            math = math + cartell[j][k];
                        }
                    }
                    if (math == 0){
                        System.out.println("P1: Bingo!!!");
                        bingo = true;
                    }
                    math = 0;
                    for (int j = 0; j < cartell2.length; j++) {
                        for (int k = 0; k < cartell2[0].length; k++) {
                            math = math + cartell2[j][k];
                        }
                    }
                    if (math == 0){
                        System.out.println("P2: Bingo!!!");
                        bingo = true;
                    }
                }

                /**Imprimir contadors*/
                System.out.println("Ha sortit la bola " + bb);
                System.out.println("Intents linia P1 " + cl + " Intents bingo P1 " + cb + "\t | Intents linia P2 " + cl2 + " Intents bingo P2 " + cb2);

                /**Pausa*/
                if (!bingo) {
                    System.out.println("Enter per la seguent bola");
                    sc.nextLine();
                }
            }

            /**Bools repetir?*/
            while (bingo) {
                System.out.println("Vols tornar a començar?");
                rep = sc.nextLine();
                if (rep.equalsIgnoreCase("N") || rep.equalsIgnoreCase("No")) {
                    tornar = false;
                    bingo = false;
                } else if (rep.equalsIgnoreCase("S") || rep.equalsIgnoreCase("Si")) {
                    bingo = false;
                } else {
                    System.out.println("No ho entenc");
                }
            }
        }
        sc.close();
    }
}