import java.util.Scanner;

public class montararrays {

    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        int[] valor = new int[5];
        int[] asc = valor;
        for (int i = 0; i < valor.length; i++) {
            valor[i] = Integer.parseInt(System.console().readLine(" introdueix un numero: "));
        }
        boolean sortir = false;
        while (!sortir) {
            System.out.println(
                    " 0-sortir \n 1- mostrar tal qual \n 2- mostrar ordenat asendent \n 3-mostrar ordenat desendent ");
            int opcio = Integer.parseInt(System.console().readLine());
            switch (opcio) {

            case 0:
                sortir = true;
                break;
            case 1:
                printa(valor);
                break;
            case 2:
                ascendent(valor, asc);
                break;
            case 3:
                desendentt(valor, asc);
                break;

            default:
                break;
            }
        }
    }

    public static void igual(int[] valor, int[] asc) {
        int[] aux = valor;
        for (int i = 0; i < aux.length; i++) {
            if (i == (aux.length - 1)) {
                System.err.println(aux[i]);
            } else {
                System.out.print(aux[i] + " - ");
            }

        }
        System.out.println();

    }

    public static void ascendent(int[] valor, int[] asc ) {
        int max = 0;
        for (int i = 0; i < valor.length - 1; i++) {
            max = i;
            for (int j = i + 1; j < valor.length; j++) {
                if (valor[j] <= valor[max]) {
                    max = j;
                }
            }
            if (i != max) {
                int aux = valor[i];
                valor[i] = valor[max];
                valor[max] = aux;
            }
        }
        printa(valor);
    }

    public static void desendentt(int[] valor, int[] asc ) {
        int min = 0;
        for (int i = 0; i < valor.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < valor.length; j++) {
                if (valor[j] >= valor[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int aux = valor[i];
                valor[i] = valor[min];
                valor[min] = aux;
            }
        }
        printa(valor);
    }

    public static void printa(int[] valor) {
        for (int i = 0; i < valor.length; i++) {
            if (i == (valor.length - 1)) {
                System.err.println(valor[i]);
            } else {
                System.out.print(valor[i] + " - ");
            }
        }
        System.out.println();

    }

}