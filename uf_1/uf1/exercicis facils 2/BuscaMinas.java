/**
 * BuscaMinas
 */
public class BuscaMinas {

    public static void main(String[] args) {
        int [][] ArrayTaula = new int [4][4];
        int[] ArrayMina = new int [3];
        System.out.println("               BUSCAMINAS              ");
        System.out.println("\n");
        Print(ArrayTaula);
        

    }
    public static void Print (int [][] ArrayTaula){

        for (int i = 0; i < ArrayTaula.length; i++) {
            for (int j = 0; j < ArrayTaula[0].length; j++) {
                System.out.print("\t " + ArrayTaula[i][j]);
                
            }
            System.out.println("\n");
        }

    }
}