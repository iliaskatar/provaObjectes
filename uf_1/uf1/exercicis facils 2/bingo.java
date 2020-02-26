/**
 * bingo2
 */
import java.util.Random;
import java.util.Scanner;
public class bingo {

    public static void main(String[] args) {
       
            Random ran = new Random();
            Scanner s= new Scanner(System.in);
            
            int[][] ArrayBingo = new int[3][9];
            int[] ArrayZero = new int[9];
            int numAleatori = 0;
            boolean bingo=false;
            int [] base= new int [89];
    
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("                                  BINGO                                    ");
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("\n");
    
            
            //que no repateixin els numeros
            for (int j = 0; j < ArrayBingo[0].length; j++) {
                for (int i = 0; i < ArrayBingo.length; i++) {
                    boolean rep = false;
                    while (!rep) {
                        numAleatori = ran.nextInt(10) + (10 * j);
                        for (int k = 0; k < ArrayBingo.length; k++) {
                            if (numAleatori == ArrayBingo[k][j]) {
                                rep = false;
                                break;
                            } else {
                                rep = true;
                            }
                        }
                    }
                    ArrayBingo[i][j] = numAleatori;
                }
            }
            //print(ArrayBingo);
            bombolla(ArrayBingo);
            
            AfagiZeros(ArrayBingo);
           int pocicio=0;
           while(!bingo){
                pocicio = TreuraBola(base, ArrayBingo, pocicio);
                print(ArrayBingo);
                bingo=true;
            }
             
    }
    public static void bombolla(int[][] ArrayBingo) {
        // ordanar en forma bombolla
        for (int k = 0; k < 2; k++) {
            for (int j = 0; j < ArrayBingo[0].length; j++) {
                for (int i = 0; i < ArrayBingo.length - 1; i++) {
                    if (ArrayBingo[i][j] > ArrayBingo[i + 1][j]) {

                        int aux = ArrayBingo[i][j];
                        ArrayBingo[i][j] = ArrayBingo[i + 1][j];
                        ArrayBingo[i + 1][j] = aux;

                    }
                }
            }
        }
    }

    public static void AfagiZeros(int[][] ArrayBingo) {

        int[] ArrayZero = new int[9];
        Random ran = new Random();

        //surtir tres numeros aleatoris nomes 3 vagades cada un
        int numero1 = 0;
        for (int i = 0; i < ArrayZero.length; i++) {
            ArrayZero[i] = 5;
        }

        for (int a = 0; a < ArrayZero.length; a++) {

            boolean stop = false;
            while (!stop) {
                numero1 = ran.nextInt(3);
                int contador = 0;
                for (int i = 0; i < ArrayZero.length; i++) {
                    if (ArrayZero[i] == numero1) {
                        contador++;
                    }
                }
                if (contador < 3) {
                    ArrayZero[a] = numero1;
                    stop = true;
                }
            }
        }
        // posar larayzero a dins de larrayBingo
        for (int j = 0; j < ArrayBingo[0].length; j++) {
            for (int i = 0; i < ArrayBingo.length; i++) {
                if (i == ArrayZero[j]) {
                    ArrayBingo[i][j] = 0;
                }
            }
        }
    }

    public static void print(int[][] ArrayBingo) {
        //printem el array
        for (int i = 0; i < ArrayBingo.length; i++) {
            for (int j = 0; j < ArrayBingo[0].length; j++) {
                System.out.print("\t" + ArrayBingo[i][j]);
            }
            System.out.println("\n");
        }
    }
    public static int TreuraBola (int[] base, int[][] ArrayBingo, int pocicio){
       
        int bola = 0;
        Random ran = new Random();
            bola = ran.nextInt(89)+1;
           
            boolean guardar = true;
        while(!guardar){
            for (int i = 0; i < base.length; i++) {
               
                   if (bola==base[i]) {
                       guardar=false;
                       break;                       
                   }  
            }
                if (guardar) {
                    base[pocicio]=bola;
                    pocicio++;
                    comprobar(bola, ArrayBingo);             
                }
        }
        System.out.println(" bola vaaa " + bola);
        return pocicio;
    }
    public static void comprobar(int i, int[][]array){
        
        for (int j = 0; j < array.length; j++) {
            for (int x = 0; x < array[0].length; x++) {
                if(bola == array[j][x]){
                    array[j][x]=0;
                }
            }
        }
    }
    public static void tiraBola (int[] base, int[][] ArrayBingo, int pocicio){
        boolean tira= false;
        while(!tira){
            System.out.println("tria la bola");
            int usuari = s.nextInt ();
            TreuraBola(base, ArrayBingo, pocicio);
            tira=true;

        }
        

    }
    public static void tapaCartellera (int[][] ArrayBingo, int bola){
        
        boolean guardar=true;

        if (guardar){
           
            for (int j = 0; j < ArrayBingo.length; j++) {
                for (int k = 0; k < ArrayBingo[0].length; k++) {
                    if (ArrayBingo[j][k] == bola) {
                        ArrayBingo[j][k] = 0;
                       // cart[j][k] = "$";
                    }
                }
                
            }

        }
    }

}