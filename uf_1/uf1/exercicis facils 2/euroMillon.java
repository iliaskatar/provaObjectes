
/**
 * euroMillon
 */
import java.util.Random;

public class euroMillon {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("|                                 EUROMILLON                             |");
        System.out.println("--------------------------------------------------------------------------");
        int[] taula = new int[5];
        int[] estrella = new int[2];
        //int opcio=0;
        String nom = System.console().readLine(" 1-automatic \n 2- manual: \n tria una opcio: ");
        if (nom.equals("automatic") || nom.equals("1")) {
            automatic(taula, estrella);
        } else {
            manual(taula, estrella);
        }
    }

    public static void manual(int[] taula, int[] estrella) {
        boolean sortir = false;
        int i = 0;

        for (i = 0; i < taula.length; i++) {
            int numero = Integer.parseInt(System.console().readLine("escriu un numero del 1 al 50: "));
            taula[i] = numero;
        }
        for (int j = 0; j < estrella.length; j++) {
            int numero1 = Integer.parseInt(System.console().readLine("escriu un numero del 1 al 10: "));
            estrella[j] = numero1;
        }
        imprimir(taula, estrella);
    }

    public static void automatic(int[] taula, int[] estrella) {
        Random rnd = new Random();
        boolean sortir = false;
        boolean surt = false;
        int i = 0;
        int j = 0;
        int maquina = 0;
        int[] millon = { 16, 5, 32, 3, 5, };
        int[] euro = { 6, 1 };
        int intents = 0;
        int contedor = 0;

        for (i = 0; i < taula.length; i++) {
            maquina = (int) (Math.random() * 50) + 1;

            taula[i] = maquina;
        }
        for (j = 0; j < estrella.length; j++) {
            maquina = (int) (Math.random() * 10) + 1;
            estrella[j] = maquina;
        }
        imprimir(taula, estrella);

        // while (!sortir) {
        // if (taula.equals(millon)) {
        // sortir=true;
        // break;
        // }
        // else{
        // intents++;
        // }

        // }
        // while (!surt) {
        //     if (estrella.equals(euro)) {
        //         sortir = true;
        //         break;
        //     } else {
        //         contedor++;
        //     }

        // }
        // intents = intents + contedor;
        // System.out.println("intents " + intents);

    }

    public static void imprimir(int[] array, int[] array1) {
        System.out.print(" 5 numeros  son:  ");
        for (int i = 0; i < array.length; i++) {
            
            System.out.print(array[i] + " , ");
        }
        System.out.print(" \n numeros estrellas son:  ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " , ");
        }
        System.out.println("\n");
    }
}